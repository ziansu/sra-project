@org.springframework.context.event.EventListener
private void onError(com.faforever.gw.messaging.incoming.ErrorMessage message) {
    lombok.val requestId = message.getRequestId();
    synchronized(pendingRequests) {
        if (pendingRequests.contains(requestId)) {
            log.error("Error on requestId {}: [{}] {}", requestId, message.getErrorCode(), message.getErrorMessage());
            pendingRequests.remove(requestId);
        }else {
            log.error("Error failed: requestId {} not pending", requestId);
        }
    }
}
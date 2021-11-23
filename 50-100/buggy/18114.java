@org.springframework.context.event.EventListener
private void onError(com.faforever.gw.messaging.incoming.ErrorMessage message) {
    lombok.val requestId = message.getRequestId();
    lombok.val future = pendingRequests.remove(message.getRequestId());
    if (future != null) {
        log.error("Error on requestId {}: [{}] {}", requestId, message.getErrorCode(), message.getErrorMessage());
        future.completeExceptionally(new com.faforever.gw.model.GwException(message.getErrorCode(), message.getErrorMessage()));
    }else {
        log.error("Error failed: requestId {} not pending", requestId);
    }
}
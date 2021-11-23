public static void logEventListenerError(java.lang.Object listener, java.lang.Exception error) {
    if (com.google.gerrit.server.extensions.events.EventUtil.log.isDebugEnabled()) {
        com.google.gerrit.server.extensions.events.EventUtil.log.debug(java.lang.String.format("Error in event listener %s", listener.getClass().getName(), error));
    }else {
        com.google.gerrit.server.extensions.events.EventUtil.log.warn("Error in listener {}: {}", listener.getClass().getName(), error.getMessage());
    }
}
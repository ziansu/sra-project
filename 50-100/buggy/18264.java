@java.lang.Override
public void onOpen() {
    messageBus.removeOnOpenHandler(this);
    org.eclipse.che.ide.websocket.MessageBus.ReadyState readyState = messageBus.getReadyState();
    new com.google.gwt.user.client.Timer() {
        @java.lang.Override
        public void run() {
            if (messageBus.getReadyState().equals(MessageBus.ReadyState.OPEN)) {
                cancel();
                started();
            }
        }
    }.scheduleRepeating(300);
}
@java.lang.Override
public void onOpen() {
    messageBus.removeOnOpenHandler(this);
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
public static void init(final ru.falseteam.vframe.socket.SocketWorker sw) {
    ru.falseteam.vframe.subscription.SubscriptionManager.sw = sw;
    sw.addOnConnectionChangeStateListener(new ru.falseteam.vframe.socket.SocketWorker.OnConnectionChangeStateListener() {
        @java.lang.Override
        public void onConnectionChangeState(boolean connected) {
            if (connected) {
            }
        }
    });
}
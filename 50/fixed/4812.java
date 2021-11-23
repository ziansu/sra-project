@java.lang.Override
protected void onDestroy() {
    com.sendbird.android.SendBird.disconnect(new com.sendbird.android.SendBird.DisconnectHandler() {
        @java.lang.Override
        public void onDisconnected() {
        }
    });
    super.onDestroy();
}
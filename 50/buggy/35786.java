@java.lang.Override
protected void onStart() {
    super.onStart();
    runOnUiThread(new java.lang.Runnable() {
        public void run() {
            attachListenerForNotifications();
        }
    });
}
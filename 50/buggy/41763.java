@java.lang.Override
public void onSuccess(java.lang.Object o) {
    getMessages();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            getOpponentData();
        }
    });
}
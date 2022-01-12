@java.lang.Override
public void onManagementMessage(java.lang.String s) {
    sr.reset();
    sln.reset();
    tts.reset();
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            chatText.setText("");
            regexpText.setText("");
        }
    });
}
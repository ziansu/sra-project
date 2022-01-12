@java.lang.Override
public void onManagementMessage(java.lang.String s) {
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            chatText.setText("");
            regexpText.setText("");
            tts.reset();
            sr.reset();
            sln.reset();
        }
    });
}
@java.lang.Override
public void onSuccess(nl.dobots.loopback.loopback.User user) {
    final java.lang.String username = ((java.lang.String) (user.get("username")));
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            _txtTitle.setText(java.lang.String.format("Hi %s", username));
        }
    });
}
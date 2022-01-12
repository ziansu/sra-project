@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    pbLoading = ((android.widget.ProgressBar) (findViewById(R.id.pbLoading)));
    pbLoading.getIndeterminateDrawable().setColorFilter(Color.WHITE, android.graphics.PorterDuff.Mode.SRC_IN);
    net.skaillz.chillyclient.AuthenticationTask task = new net.skaillz.chillyclient.AuthenticationTask(this);
    try {
        task.doInBackground(new java.net.URL(URLContainer.AUTHENTICATE));
    } catch (java.net.MalformedURLException e) {
        android.util.Log.e(net.skaillz.chillyclient.LoginActivity.TAG, ("Malformed URL " + (e.getMessage())));
    }
}
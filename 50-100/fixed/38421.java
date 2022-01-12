@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.login_activity);
    setContentView(R.layout.login_activity);
    if (savedInstanceState != null) {
        return ;
    }
    toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    if (com.m2049r.xmrwallet.util.Helper.getWritePermission(this)) {
        startLoginFragment();
    }else {
        android.util.Log.i(com.m2049r.xmrwallet.LoginActivity.TAG, "Waiting for permissions");
    }
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.facebook.FacebookSdk.sdkInitialize(getApplicationContext());
    setContentView(R.layout.activity_login);
    mFragmentManager = getSupportFragmentManager();
    android.support.v4.app.FragmentTransaction transaction = mFragmentManager.beginTransaction();
    transaction.replace(android.R.id.content, new io.github.getExposure.LoginFragment(), io.github.getExposure.LoginActivity.FRAGMENT_TAG);
    transaction.commit();
}
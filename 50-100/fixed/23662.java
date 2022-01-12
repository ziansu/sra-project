@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login_screen);
    loginSetup();
    if ((getSupportActionBar()) != null) {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    if (com.presentech.handsup.LoginScreenActivity.loginCompleted) {
        startActivity(submitLoginDetails);
    }
}
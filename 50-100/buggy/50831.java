@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((org.wordpress.android.WordPress) (getApplication())).component().inject(this);
    setContentView(R.layout.welcome_activity);
    if (savedInstanceState == null) {
        addLoginPrologueFragment();
    }
    mLoginNavigationController = new org.wordpress.android.ui.accounts.login.nav.LoginNavigationController(org.wordpress.android.ui.accounts.login.nav.LoginState.PROLOGUE, this);
}
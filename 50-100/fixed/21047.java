@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    injectDependencies();
    delegate = android.support.v7.app.AppCompatDelegate.create(this, this);
    delegate.onCreate(savedInstanceState);
    delegate.setContentView(getContentView());
    initLayout(getIntent());
    if (((mType) == (AppLock.ENABLE_PINLOCK)) || ((mType) == (AppLock.CHANGE_PIN))) {
        mForgotTextView.setVisibility(View.INVISIBLE);
    }else {
        mForgotTextView.setVisibility(View.VISIBLE);
    }
}
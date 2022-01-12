@java.lang.Override
protected void initData() {
    android.content.Intent intent = getIntent();
    if (intent != null) {
        java.lang.String title = intent.getStringExtra(Constants.KEY_RESET_PASSWORD);
        if (Constants.KEY_RESET_PASSWORD.equals(title)) {
            setTitle(getString(R.string.reset_password_title));
        }
    }
    cn.smssdk.SMSSDK.registerEventHandler(mEventHandler);
}
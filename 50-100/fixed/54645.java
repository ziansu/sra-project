@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    applyLocale();
    if ((org.wordpress.android.WordPress.wpDB) == null) {
        org.wordpress.android.util.ToastUtils.showToast(this, R.string.fatal_db_error, ToastUtils.Duration.LONG);
        finish();
        return ;
    }
    android.content.Intent intent = new android.content.Intent(this, org.wordpress.android.ui.main.WPMainActivity.class);
    startActivity(intent);
    finish();
}
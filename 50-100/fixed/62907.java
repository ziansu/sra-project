@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_base);
    android.support.v4.app.ActivityCompat.postponeEnterTransition(this);
    setNavigationToolbar();
    int userId = getIntent().getIntExtra(com.belatrixsf.connect.ui.account.AccountActivity.USER_ID_KEY, (-1));
    if (userId != (-1)) {
        byte[] bytesImg = getIntent().getExtras().getByteArray(com.belatrixsf.connect.ui.account.AccountActivity.USER_IMG_PROFILE_KEY);
        replaceFragment(com.belatrixsf.connect.ui.account.AccountFragment.newInstance(userId, bytesImg), false);
    }
}
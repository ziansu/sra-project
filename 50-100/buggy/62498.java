@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    getWindow().setStatusBarColor(Color.TRANSPARENT);
    mLoginPresenter = new com.morening.october_userlogin.presenter.impl.LoginPresenter(this);
    mHandler = new android.os.Handler(android.os.Looper.getMainLooper());
    setupTransition();
    setupViews();
}
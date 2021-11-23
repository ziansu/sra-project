@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this);
    setContentView(getContentView());
    butterknife.ButterKnife.bind(this);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.KITKAT)) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    }
    deviceWidth = getWindowManager().getDefaultDisplay().getWidth();
    devideHeight = getWindowManager().getDefaultDisplay().getHeight();
}
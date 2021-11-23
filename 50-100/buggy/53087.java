@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_full_color);
    butterknife.ButterKnife.bind(this);
    mPresenter = new com.huhx0015.screencolortester.presentation.presenters.implementations.FullColorPresenterImpl(this);
    android.os.Bundle bundle = getIntent().getExtras();
    if (bundle != null) {
        com.huhx0015.screencolortester.domain.models.ScreenColor color = bundle.getParcelable(ColorConstants.BUNDLE_SCREEN_COLOR);
        if (color != null) {
            mPresenter.setColorBackground(color);
        }
    }
    mPresenter.setBrightness();
}
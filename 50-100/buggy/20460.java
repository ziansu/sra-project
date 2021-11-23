@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    isNight = com.jzzq.broker.utils.SpUtil.isNight();
    setTheme((isNight ? R.style.AppThemeNight : R.style.AppThemeDay));
    com.jzzq.broker.AppManager.getInstance().addActivity(this);
    setContentView(getLayoutId());
    mUnBinder = butterknife.ButterKnife.bind(this);
    mContext = this;
    setSwipeBackEnable(true);
    initTitle(savedInstanceState);
    initView(savedInstanceState);
}
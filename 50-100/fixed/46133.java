@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display_video);
    butterknife.ButterKnife.bind(this);
    mHandler = new android.os.Handler();
    mSqLiteCommon = new data.local.SQLiteCommon(this);
    getVideoUrl();
    initView();
    if (savedInstanceState != null)
        disPlayVideo(mVideoUrl);
    
    randomDataModel(Constant.NUMBER_RANDOM);
}
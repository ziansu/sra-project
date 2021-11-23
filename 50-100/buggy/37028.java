@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    uk.co.chrisjenx.calligraphy.CalligraphyConfig.initDefault(new uk.co.chrisjenx.calligraphy.CalligraphyConfig.Builder().setDefaultFontPath("fonts/regular.ttf").setFontAttrId(R.attr.fontPath).build());
    butterknife.ButterKnife.bind(this);
}
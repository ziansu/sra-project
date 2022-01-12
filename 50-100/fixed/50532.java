@java.lang.Override
protected void init() {
    android.content.Intent intent = getIntent();
    guid = intent.getStringExtra(ConstantUtils.KEY);
    isNull = intent.getBooleanExtra(ConstantUtils.KEY_NULL, false);
    name = intent.getStringExtra(ConstantUtils.KEY_NAME);
    initToolbar();
    mInfo.setOnClickListener(this);
    mEvernsc = getEnsc();
}
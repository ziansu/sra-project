@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main_preview);
    bProcessor = new com.apps.alexs7.pointop.BProcessor(this);
    fragmentHelper = new com.apps.alexs7.pointop.FragmentHelper(this);
    fragmentHelper.setupFragments();
    fragmentHelper.getCleanPreviewFragment().getCamera().setDisplayOrientation(90);
    com.apps.alexs7.pointop.UIHelper.buidListWithChoices(this, bProcessor);
}
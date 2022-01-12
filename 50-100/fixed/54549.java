@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sample);
    fTrans = getSupportFragmentManager().beginTransaction();
    frameLayout = ((android.widget.FrameLayout) (findViewById(R.id.frgmCont)));
    uCropFragment = new com.yalantis.ucrop.UCropFragment().newInstance(frameLayout);
    fTrans.replace(R.id.frgmCont, uCropFragment);
    fTrans.commit();
    setupUI();
}
@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.activity_register);
    super.onCreate(savedInstanceState);
    initViews();
    mCurrentStep = initStep();
    initEvents();
    initBackDialog();
}
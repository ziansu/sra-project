@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    setContentView(R.layout.activity_allmachine);
    android.util.Log.e(TAG, "RawMaterial_onCreate");
    initDisplay();
    initTitleLayout();
    initCellTitle();
    initRecycleView();
    initBottomView();
    com.android.tedcoder.material.AllMachineActivity.requestHandler = new com.android.tedcoder.material.AllMachineActivity.RequestHandler();
    com.android.tedcoder.material.AllMachineActivity.requestHandler.sendEmptyMessage(com.android.tedcoder.material.AllMachineActivity.SENDFLAG);
    com.android.tedcoder.material.AllMachineActivity.requestHandler.sendEmptyMessage(com.android.tedcoder.material.AllMachineActivity.SCROLLTIME);
}
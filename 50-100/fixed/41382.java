@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_stone);
    init();
    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
    intentFilter.addAction(com.just.stone.service.StoneAccessibilityService.getCallBackAction(this));
    this.registerReceiver(mBroadCastReceiver, intentFilter);
}
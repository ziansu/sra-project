@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initializeFiles();
    initSwitchListener();
    try {
        de.myo.myoscriptcontrol.GestureScriptManager.getInstance().setConfigFile(ConfigFile);
        mStatus = RecordActivityStatus.DISCONNECTED;
    } catch (java.io.IOException | org.json.JSONException e) {
        e.printStackTrace();
        de.myo.myoscriptcontrol.ErrorActivity.handleError(this, e.getMessage());
    }
    initializeMYOHub();
    initGridAdapter();
    OnUpdateStatus(de.myo.myoscriptcontrol.GestureRecordDeviceListener.getInstance().getStatus());
}
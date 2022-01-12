@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    de.greenrobot.event.EventBus.getDefault().register(this);
    com.mindarc.screenrecorder.RecorderModel.getModel().init(this);
    StorageHelper.sStorageHelper.init(this);
    init();
    if (!(com.mindarc.screenrecorder.RecorderModel.getModel().isInitialized())) {
        showInitFragment();
    }else {
        showRecorderFragment();
    }
}
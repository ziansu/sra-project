@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    unbinder = butterknife.ButterKnife.bind(this);
    sdRoot = android.os.Environment.getExternalStorageDirectory();
    sensorManager = ((android.hardware.SensorManager) (getSystemService(com.moto.pixelr.activity.SENSOR_SERVICE)));
    com.huhx0015.hxgselib.audio.HXGSEMusicEngine.getInstance().initializeAudio();
    com.huhx0015.hxgselib.audio.HXGSEDolbyEffects.getInstance().initializeDolby(this);
    initDisplay();
    initView();
    initService();
}
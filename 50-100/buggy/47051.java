@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        initScanCallback();
    }
    service = this;
    foregroundServiceStarter = new com.eveningoutpost.dexdrip.UtilityModels.ForegroundServiceStarter(getApplicationContext(), service);
    foregroundServiceStarter.start();
    bgToSpeech = com.eveningoutpost.dexdrip.utils.BgToSpeech.setupTTS(getApplicationContext());
    handler = new android.os.Handler(getApplicationContext().getMainLooper());
}
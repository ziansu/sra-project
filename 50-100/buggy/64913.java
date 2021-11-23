@java.lang.Override
public void onCreate() {
    super.onCreate();
    android.util.Log.d(com.tomerrosenfeld.tweaksforgo.Services.MainService.class.getSimpleName(), "Main service started");
    prefs = new com.tomerrosenfeld.tweaksforgo.Prefs(this);
    initWindowManager();
    initOriginalStates();
    initAccelerometer();
    initScreenHolder();
    initScreenReceiver();
    checkIfGoIsCurrentApp();
    initFloatingActionButton();
}
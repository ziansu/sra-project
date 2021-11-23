@java.lang.Override
public void onCreate() {
    super.onCreate();
    initEvents();
    timeRec = new de.mhid.android.timerecordingforpebble.TimeRecConnector(this);
    messenger.initReceiver(this);
    android.util.Log.d(this.getClass().getName(), "onCreate()");
}
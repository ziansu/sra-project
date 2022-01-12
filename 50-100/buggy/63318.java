@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.kotemaru.android.taskkiller.persistent.Config.init(this);
    mDatabase = new org.kotemaru.android.taskkiller.persistent.Database(this);
    mDbMap = mDatabase.getMap();
    org.kotemaru.android.taskkiller.receiver.ScreenOffReceiver.create(this);
    mProcessMonitor = new org.kotemaru.android.taskkiller.monitor.ProcessMonitor(this);
    mProcessMonitor.refresh(this);
}
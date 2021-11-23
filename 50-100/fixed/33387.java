@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    com.ds.avare.StorageService.LocalBinder binder = ((com.ds.avare.StorageService.LocalBinder) (service));
    mInfc.connect(binder.getService());
    mService = binder.getService();
    mService.registerGpsListener(mGpsInfc);
    mTimer = new java.util.Timer();
    java.util.TimerTask sim = new com.ds.avare.PlanActivity.UpdateTask();
    mTimer.scheduleAtFixedRate(sim, 0, 1000);
}
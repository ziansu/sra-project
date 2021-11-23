@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    unipd.dei.ESP1415.falldetector.FallService.MyBinder binder = ((unipd.dei.ESP1415.falldetector.FallService.MyBinder) (service));
    mService = binder.getService();
    mBound = true;
}
@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    com.ds.avare.StorageService.LocalBinder binder = ((com.ds.avare.StorageService.LocalBinder) (service));
    mInfc.connect(binder.getService());
    mService = binder.getService();
    mService.registerGpsListener(mGpsInfc);
}
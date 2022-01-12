@java.lang.Override
public void onServiceConnected(android.content.ComponentName className, android.os.IBinder service) {
    com.ds.avare.StorageService.LocalBinder binder = ((com.ds.avare.StorageService.LocalBinder) (service));
    mService = binder.getService();
    mService.registerGpsListener(mGpsInfc);
    mInfc.connect(mService);
    if (mIsPageLoaded) {
        mInfc.newList();
        mInfc.newSaveList();
    }
}
@java.lang.Override
public void bindService() {
    if ((mRequestMessengerRef) == null) {
        android.content.Intent intent = new vandy.mooc.services.DownloadImagesBoundService().makeIntent(mActivity.get());
        android.util.Log.d(vandy.mooc.operations.TAG, "calling bindService()");
        mActivity.get().bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
    }
}
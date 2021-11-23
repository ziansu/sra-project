@java.lang.Override
public void bindService() {
    android.util.Log.d(TAG, "calling bindService()");
    if ((mServiceConnectionAsync.getInterface()) == null)
        mActivity.get().bindService(vandy.mooc.services.AcronymServiceAsync.makeIntent(mActivity.get()), mServiceConnectionAsync, Context.BIND_AUTO_CREATE);
    
    if ((mServiceConnectionSync.getInterface()) == null)
        mActivity.get().bindService(vandy.mooc.services.AcronymServiceSync.makeIntent(mActivity.get()), mServiceConnectionSync, Context.BIND_AUTO_CREATE);
    
}
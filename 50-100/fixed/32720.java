@java.lang.Override
public void onDestroy() {
    if (useEventBus())
        org.simple.eventbus.EventBus.getDefault().unregister(this);
    
    unDispose();
    if ((mModel) != null)
        mModel.onDestroy();
    
    this.mModel = null;
    this.mRootView = null;
    this.mCompositeDisposable = null;
}
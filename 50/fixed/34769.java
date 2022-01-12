@java.lang.Override
public void onCollectExtraUpdates(com.facebook.react.uimanager.UIViewOperationQueue uiUpdater) {
    super.onCollectExtraUpdates(uiUpdater);
    uiUpdater.enqueueUpdateExtraData(getReactTag(), this);
    queueRender();
}
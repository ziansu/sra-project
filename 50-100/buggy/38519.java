@java.lang.Override
public void onCollectExtraUpdates(com.facebook.react.uimanager.UIViewOperationQueue uiViewOperationQueue) {
    super.onCollectExtraUpdates(uiViewOperationQueue);
    org.vovkasm.WebImage.ShadowBoxMetrics bm = new org.vovkasm.WebImage.ShadowBoxMetrics(getLayoutWidth(), getLayoutHeight(), getEffectiveBorderWidth(Spacing.START), getEffectiveBorderWidth(Spacing.TOP), getEffectiveBorderWidth(Spacing.END), getEffectiveBorderWidth(Spacing.BOTTOM), getPadding(Spacing.LEFT), getPadding(Spacing.TOP), getPadding(Spacing.RIGHT), getPadding(Spacing.BOTTOM));
    uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), bm);
}
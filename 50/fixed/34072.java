@java.lang.Override
public void onVisibilityChanged(com.appnexus.opensdk.View view, int visibility) {
    super.onVisibilityChanged(view, visibility);
    handleVisibilityChangedEvent(getWindowVisibility(), visibility);
}
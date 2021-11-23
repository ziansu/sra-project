@java.lang.Override
public void dispose() {
    if ((_partListener) != null) {
        getViewSite().getPage().removePartListener(_partListener);
        _mapApp.stop();
    }
    super.dispose();
}
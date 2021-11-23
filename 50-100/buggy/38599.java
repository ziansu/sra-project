void selectTabByTabWidget(com.google.gwt.user.client.ui.Widget tabWidget) {
    int numTabs = getWidgetCount();
    for (int i = 1; i < numTabs; ++i) {
        org.geogebra.common.util.debug.Log.debug(((i + ": ") + (getWidget(i).getElement().toString())));
        if ((getWidget(i)) == tabWidget) {
            selectTab(i);
            return ;
        }
    }
}
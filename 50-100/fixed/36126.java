@java.lang.Override
public void onActivate(org.cruxframework.crux.core.client.screen.views.ViewActivateEvent event) {
    if (updateOnViewChangeEnabled) {
        java.lang.String viewId = event.getView().getId();
        int viewIndex = indexOfItemByView(viewId);
        if ((viewIndex >= 0) && (viewIndex != (activeIndex))) {
            setActiveIndex(viewIndex, false);
        }
    }
}
@java.lang.Override
public void onTouchEnd(com.googlecode.mgwt.dom.client.event.touch.TouchEndEvent event) {
    event.stopPropagation();
    event.preventDefault();
    removeStyleName(active);
    if (com.googlecode.mgwt.ui.client.MGWT.getOsDetection().isDesktop()) {
        com.google.gwt.user.client.DOM.releaseCapture(getElement());
    }
}
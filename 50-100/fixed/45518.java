@java.lang.Override
protected void doSetupOrientation() {
    if (isDeviceOrientationSupported()) {
        com.google.gwt.user.client.Window.addResizeHandler(new com.google.gwt.event.logical.shared.ResizeHandler() {
            @java.lang.Override
            public void onResize(com.google.gwt.event.logical.shared.ResizeEvent event) {
                com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION orientation = getOrientationByMatchMedia();
                handleOrientationChange(orientation);
            }
        });
    }else {
        com.google.gwt.user.client.Window.addResizeHandler(new com.google.gwt.event.logical.shared.ResizeHandler() {
            @java.lang.Override
            public void onResize(com.google.gwt.event.logical.shared.ResizeEvent event) {
                com.googlecode.mgwt.dom.client.event.orientation.OrientationChangeEvent.ORIENTATION orientation = getOrientationByScreenSize();
                handleOrientationChange(orientation);
            }
        });
    }
}
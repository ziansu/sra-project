private void initWindowResize() {
    if ((windowResizeInitialized) != null)
        return ;
    
    windowResizeInitialized = com.google.gwt.user.client.Window.addResizeHandler(new com.google.gwt.event.logical.shared.ResizeHandler() {
        @java.lang.Override
        public void onResize(com.google.gwt.event.logical.shared.ResizeEvent event) {
            processFixedToolbars();
            recalcContentHeightPercent();
            centerContent();
        }
    });
}
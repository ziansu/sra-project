@java.lang.Override
protected void init() {
    super.init();
    rpc = initRpc();
    this.heightRedistributionStrategy = initHeightRedistributionStrategy();
    getLayoutManager().addElementResizeListener(getWidget().getElement(), new com.vaadin.client.ui.layout.ElementResizeListener() {
        @java.lang.Override
        public void onElementResize(com.vaadin.client.ui.layout.ElementResizeEvent e) {
        }
    });
}
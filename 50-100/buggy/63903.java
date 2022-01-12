@java.lang.Override
public void addComponent() {
    this.vp = new com.extjs.gxt.ui.client.widget.VerticalPanel();
    vp.setSpacing(10);
    this.layersTabWidget = new org.geosdi.geoplatform.gui.client.widget.tab.LayersTabWidget();
    this.vp.add(this.layersTabWidget);
    super.add(this.vp);
    com.extjs.gxt.ui.client.widget.button.Button close = new com.extjs.gxt.ui.client.widget.button.Button(ButtonsConstants.INSTANCE.closeText(), new com.extjs.gxt.ui.client.event.SelectionListener<com.extjs.gxt.ui.client.event.ButtonEvent>() {
        @java.lang.Override
        public void componentSelected(com.extjs.gxt.ui.client.event.ButtonEvent ce) {
            hide();
        }
    });
    super.addButton(close);
}
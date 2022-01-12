public void initializeComponents() {
    componentSelectionPanel.clear();
    for (int i = 0; i < (data.componentIdList.size()); i++) {
        com.google.gwt.user.client.ui.HTML item = new com.google.gwt.user.client.ui.HTML(data.componentIdList.get(i));
        item.setStyleName("wmt-ComponentSelectionMenuItem");
        item.addStyleDependentName("missing");
        componentSelectionPanel.add(item);
    }
}
private void styleControls() {
    itemFlexTable.setCellSpacing(0);
    itemFlexTable.setCellPadding(0);
    itemFlexTable.addStyleName("rdn-Grid");
    itemFlexTable.addStyleName("rdn-GridNoHeader");
    setSize("600px", "100%");
    titleLabel.setStyleName("rdn-Head");
    this.getElement().getStyle().setProperty("padding", "10px");
    getElement().getStyle().setZIndex(1000);
    actionsWidget.addStyleName("rdn-VerticalSpacer");
}
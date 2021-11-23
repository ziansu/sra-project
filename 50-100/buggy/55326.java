private void styleControls() {
    getElement().getStyle().setProperty("padding", "10px");
    getElement().getStyle().setZIndex(1000);
    colorTextBox.setStyleName("rdn-TextBoxMedium");
    alphaTextBox.setStyleName("rdn-TextBoxShort");
    contentPanel.getElement().getStyle().setProperty("border", "1px solid #999");
    contentBar.getElement().getStyle().setProperty("fontWeight", "normal !important");
    historyWidget.addStyleName("rdn-VerticalSpacer");
    buttonPanel.addStyleName("rdn-VerticalSpacer");
}
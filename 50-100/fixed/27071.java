private void styleControls() {
    mainGrid.setCellSpacing(0);
    mainGrid.setCellPadding(0);
    mainGrid.setStyleName("rdn-Table");
    boldCheckBox.addStyleName("rdn-CheckBox");
    italicCheckBox.addStyleName("rdn-CheckBox");
    cssLabel.addStyleName("rdn-OverflowElipsis");
    cssLabel.setWidth("420px");
    cssTextBox.setStyleName("rdn-TextBoxLong");
    getElement().getStyle().setProperty("padding", "10px");
    buttonPanel.addStyleName("rdn-VerticalSpacer");
}
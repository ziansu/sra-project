private com.vaadin.ui.TextField createSearchField() {
    final com.vaadin.ui.TextField textField = new org.eclipse.hawkbit.ui.common.builder.TextFieldBuilder().immediate(true).id("custom.query.text.Id").maxLengthAllowed(SPUILabelDefinitions.TARGET_FILTER_QUERY_TEXT_FIELD_LENGTH).buildTextComponent();
    textField.addStyleName("target-filter-textfield");
    textField.setWidth(900.0F, Unit.PIXELS);
    textField.setTextChangeEventMode(TextChangeEventMode.EAGER);
    textField.setImmediate(true);
    textField.setTextChangeTimeout(100);
    return textField;
}
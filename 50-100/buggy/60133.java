private org.gwtbootstrap3.client.ui.base.TextBoxBase createTextBox(final org.eclipse.kura.web.shared.model.GwtConfigParameter param) {
    if (param.getDescription().contains("\u200b\u200b\u200b\u200b\u200b")) {
        final org.gwtbootstrap3.client.ui.TextArea result = createTextArea();
        result.setHeight("120px");
        return result;
    }
    if (isTextArea(param)) {
        return createTextArea();
    }
    return new org.gwtbootstrap3.client.ui.TextBox();
}
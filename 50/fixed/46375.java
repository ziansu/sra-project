@java.lang.Override
public void setupLayout() {
    super.setupLayout();
    org.talend.daikon.properties.presentation.Form form = org.talend.daikon.properties.presentation.Form.create(this, Form.MAIN);
    form.addRow(userName);
    form.addRow(widget(userPassword).setWidgetType(WidgetType.HIDDEN_TEXT));
}
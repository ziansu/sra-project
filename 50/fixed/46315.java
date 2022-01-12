@java.lang.Override
public void setupLayout() {
    super.setupLayout();
    org.talend.daikon.properties.presentation.Form form = org.talend.daikon.properties.presentation.Form.create(this, Form.MAIN);
    form.addRow(userId);
    form.addRow(nestedProps.getForm(Form.MAIN));
}
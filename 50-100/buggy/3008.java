@java.lang.Override
public void setupLayout() {
    super.setupLayout();
    org.talend.daikon.properties.presentation.Form schemaForm = org.talend.daikon.properties.presentation.Form.create(this, Form.MAIN, "Schema");
    schemaForm.addRow(widget(schema).setWidgetType(WidgetType.SCHEMA_EDITOR));
    org.talend.daikon.properties.presentation.Form schemaRefForm = org.talend.daikon.properties.presentation.Form.create(this, Form.REFERENCE, "Schema");
    schemaRefForm.addRow(widget(schema).setWidgetType(WidgetType.SCHEMA_REFERENCE));
}
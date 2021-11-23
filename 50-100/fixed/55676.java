@java.lang.Override
public void setupLayout() {
    super.setupLayout();
    org.talend.daikon.properties.presentation.Form mainForm = new org.talend.daikon.properties.presentation.Form(this, org.talend.daikon.properties.presentation.Form.MAIN);
    mainForm.addColumn(column);
    mainForm.addColumn(org.talend.daikon.properties.presentation.Widget.widget(function).setWidgetType(Widget.ENUMERATION_WIDGET_TYPE));
    mainForm.addColumn(operand);
    mainForm.addColumn(org.talend.daikon.properties.presentation.Widget.widget(predicate).setWidgetType(Widget.ENUMERATION_WIDGET_TYPE));
    mainForm.addColumn(org.talend.daikon.properties.presentation.Widget.widget(fieldType).setWidgetType(Widget.ENUMERATION_WIDGET_TYPE));
}
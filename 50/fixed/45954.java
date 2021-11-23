private com.fasterxml.jackson.databind.node.ObjectNode processTPropertiesWidget(org.talend.daikon.properties.Properties cProperties, java.lang.String formName) {
    org.talend.daikon.properties.presentation.Form mainForm = cProperties.getPreferredForm(formName);
    return processTPropertiesWidget(mainForm);
}
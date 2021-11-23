public void afterApiMode() {
    if (connection.apiMode.getValue().equals(APIMode.SOAP)) {
        schemaInput.schema.setValue(org.talend.components.marketo.MarketoConstants.getSOAPOuputSchemaForSyncLead());
    }else {
        schemaInput.schema.setValue(org.talend.components.marketo.MarketoConstants.getRESTOutputSchemaForSyncLead());
    }
    afterOutputOperation();
}
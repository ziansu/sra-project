public void afterApiMode() {
    org.talend.components.marketo.tmarketooutput.TMarketoOutputProperties.LOG.error("[TMarketoOutput] afterApiMode");
    if (connection.apiMode.getValue().equals(APIMode.SOAP)) {
        schemaInput.schema.setValue(org.talend.components.marketo.MarketoConstants.getSOAPOuputSchemaForSyncLead());
    }else {
        schemaInput.schema.setValue(org.talend.components.marketo.MarketoConstants.getRESTOutputSchemaForSyncLead());
    }
    afterOutputOperation();
}
@java.lang.Override
public void setupProperties() {
    super.setupProperties();
    table.setSchemaListener(new org.talend.components.api.component.ISchemaListener() {
        @java.lang.Override
        public void afterSchema() {
            updateOutputSchema();
            updateRejectSchema();
        }
    });
}
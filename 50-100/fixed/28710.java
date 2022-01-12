public org.talend.core.model.metadata.builder.connection.DatabaseConnection getDatabaseConnection() {
    org.talend.core.model.properties.Property property = this.getObject().getProperty();
    if (((property != null) && ((property.getItem()) != null)) && ((((org.talend.core.model.properties.ConnectionItem) (property.getItem())).getConnection()) instanceof org.talend.core.model.metadata.builder.connection.DatabaseConnection)) {
        return ((org.talend.core.model.metadata.builder.connection.DatabaseConnection) (((org.talend.core.model.properties.ConnectionItem) (property.getItem())).getConnection()));
    }
    return null;
}
public org.talend.core.model.metadata.builder.connection.DatabaseConnection getDatabaseConnection() {
    org.talend.core.model.metadata.builder.connection.DatabaseConnection dbConnection = null;
    org.talend.core.model.properties.Property property = getObject().getProperty();
    dbConnection = ((org.talend.core.model.metadata.builder.connection.DatabaseConnection) (((org.talend.core.model.properties.ConnectionItem) (property.getItem())).getConnection()));
    return dbConnection;
}
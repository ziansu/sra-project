@com.linkedin.pinot.controller.api.swagger.HttpVerb(value = "put")
@com.linkedin.pinot.controller.api.swagger.Summary(value = "Updates the metadata configuration for a table")
@com.linkedin.pinot.controller.api.swagger.Tags(value = { "table" })
@com.linkedin.pinot.controller.api.swagger.Paths(value = { "/tables/{tableName}/metadataConfigs" })
private org.restlet.representation.Representation updateTableMetadata(@com.linkedin.pinot.controller.api.swagger.Parameter(name = "tableName", in = "path", description = "The name of the table for which to update the metadata configuration", required = true)
java.lang.String tableName, org.restlet.representation.Representation entity, com.linkedin.pinot.common.config.AbstractTableConfig config) throws java.lang.Exception {
    config = com.linkedin.pinot.common.config.AbstractTableConfig.init(entity.getText());
    manager.updateMetadataConfigFor(config.getTableName(), com.linkedin.pinot.common.utils.CommonConstants.Helix.TableType.valueOf(config.getTableType()), config.getCustomConfigs());
    return new org.restlet.representation.StringRepresentation("done");
}
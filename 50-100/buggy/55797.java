private java.lang.String makeIndexName(final edu.pitt.sis.exp.colfusion.dal.dataModels.tableDataModel.RelationKey relationKey, final java.lang.String columnName) {
    java.lang.String indexName = java.lang.String.format("Index_%s_%s_%s", this.getDatabase(), relationKey.getDbTableName(), columnName);
    java.lang.String indexShortName = edu.pitt.sis.exp.colfusion.utils.StringUtils.makeShortUnique(indexName, edu.pitt.sis.exp.colfusion.dal.databaseHandlers.MySQLDatabaseHandler.INDEX_NAME_MAX_LENGTH);
    logger.info(java.lang.String.format("Generated index name %s", indexShortName));
    return indexShortName;
}
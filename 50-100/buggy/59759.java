private void deleteJoinTableData(@org.jetbrains.annotations.NotNull
org.labkey.api.data.TableInfo tableInfo, @org.jetbrains.annotations.NotNull
java.lang.String keyName, @org.jetbrains.annotations.NotNull
org.labkey.api.security.User user, @org.jetbrains.annotations.NotNull
org.labkey.api.data.Container container, org.labkey.api.data.SimpleFilter objectIdFilter) throws java.sql.SQLException, org.labkey.api.query.BatchValidationException, org.labkey.api.query.InvalidKeyException, org.labkey.api.query.QueryUpdateServiceException {
    tableInfo.getUpdateService().deleteRows(user, container, getJoinTableIds(tableInfo, keyName, objectIdFilter), null, null);
}
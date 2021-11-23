protected void copyCompanyTable(java.sql.Connection sourceConnection, java.sql.Connection targetConnection, java.lang.String shardName) throws java.lang.Exception {
    copyControlTable(sourceConnection, targetConnection, CompanyTable.TABLE_NAME, CompanyTable.TABLE_COLUMNS, CompanyTable.TABLE_SQL_CREATE);
    java.util.List<java.lang.Long> companyIds = getCompanyIds(shardName);
    java.lang.String companyIdsString = com.liferay.portal.kernel.util.ListUtil.toString(companyIds, StringPool.NULL, StringPool.COMMA);
    runSQL(sourceConnection, (("delete from Company where companyId in (" + companyIdsString) + ")"));
    runSQL(targetConnection, (("delete from Company where companyId not in (" + companyIdsString) + ")"));
}
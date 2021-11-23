private java.lang.String createExpectedQueryString(aprs.framework.database.DbQueryInfo queryInfo, java.util.Map<java.lang.Integer, java.lang.Object> map) throws java.sql.SQLException {
    java.lang.String queryFormat = getQueryFormat();
    aprs.framework.database.DbParamTypeEnum[] paramTypes = queryInfo.getParams();
    java.lang.String qString = queryInfo.getQuery();
    for (int i = 0; i < (paramTypes.length); i++) {
        qString = qString.replace(java.lang.String.format(queryFormat, i), map.get((i + 1)).toString());
    }
    return qString;
}
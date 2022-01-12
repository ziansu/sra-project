public java.lang.String getSQLByNameWithParameters(java.lang.String name, java.lang.Object parameters) {
    if (name == null) {
        return null;
    }
    java.util.Map<java.lang.String, java.lang.Object> parameterMap = buildParameters(parameters);
    org.pinae.timon.io.SQLMapper.SQL sql = this.sqlMap.get(name);
    if (sql != null) {
        return replaceSQL(sql, parameterMap);
    }else {
        return null;
    }
}
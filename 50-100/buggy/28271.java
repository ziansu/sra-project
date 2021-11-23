private org.apache.ibatis.mapping.SqlSource buildSqlSourceFromStrings(java.lang.String[] strings, java.lang.Class<?> parameterTypeClass, org.apache.ibatis.scripting.LanguageDriver languageDriver) {
    final java.lang.StringBuilder sql = new java.lang.StringBuilder();
    for (java.lang.String fragment : strings) {
        sql.append(fragment);
        sql.append(" ");
    }
    return languageDriver.createSqlSource(configuration, sql.toString(), parameterTypeClass);
}
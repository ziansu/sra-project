public static com.raizlabs.android.dbflow.sql.language.ColumnAlias columnsWithFunction(java.lang.String functionName, com.raizlabs.android.dbflow.sql.language.ColumnAlias... columnAliases) {
    com.raizlabs.android.dbflow.sql.QueryBuilder queryBuilder = new com.raizlabs.android.dbflow.sql.QueryBuilder(functionName).append("(");
    for (int i = 0; i < (columnAliases.length); i++) {
        if (i > 0) {
            queryBuilder.append(",");
        }
        queryBuilder.append(columnAliases[i].getAliasName());
    }
    queryBuilder.append(")");
    return com.raizlabs.android.dbflow.sql.language.ColumnAlias.columnRaw(queryBuilder.getQuery());
}
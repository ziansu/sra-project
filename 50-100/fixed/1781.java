public static java.lang.String createDeleteSqlForHelper(java.lang.String table, java.lang.String idColumn, java.lang.Object objectId) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(" delete from ");
    sb.append(table).append(" where ").append(idColumn).append(" = ").append(objectId).append(";");
    return sb.toString();
}
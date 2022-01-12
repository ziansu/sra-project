public static java.lang.String createDeleteSqlForHelper(java.lang.String table, java.lang.String idColumn, java.lang.String objectId, java.lang.String foreignIdColumn, java.lang.String subObjectId) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(" delete from ");
    sb.append(table).append(" where ").append(idColumn).append(" = ").append(objectId).append(" and ").append(foreignIdColumn).append(" = ").append(subObjectId).append(";");
    return sb.toString();
}
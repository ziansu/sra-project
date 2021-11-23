private java.lang.String getDeleteSql() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder();
    sb.append("delete from ");
    sb.append(this.dbName).append(".").append(this.tableName).append(" ");
    if (!(com.roc.core.Utils.StringUtil.isEmpty(this.condition))) {
        sb.append("where ").append(this.condition);
    }
    return sb.toString();
}
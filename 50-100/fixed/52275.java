public com.ikaihuo.gp.storage.dc.api.idc.kits.SqlKit.Sql orderBy(java.lang.String... orders) {
    this.sql.append(" ORDER BY ");
    java.lang.String suffix = ", ";
    for (java.lang.String column : orders) {
        this.sql.append(column).append(suffix);
    }
    this.sql.delete(((this.sql.length()) - (suffix.length())), this.sql.length());
    return this;
}
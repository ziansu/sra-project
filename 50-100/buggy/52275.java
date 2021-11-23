public com.ikaihuo.gp.storage.dc.api.idc.kits.SqlKit.Sql orderBy(java.lang.String... orders) {
    java.lang.StringBuilder sbr = new java.lang.StringBuilder(this.sql);
    sbr.append(" ORDER BY ");
    java.lang.String suffix = ", ";
    for (java.lang.String column : orders) {
        sbr.append(column).append(suffix);
    }
    sbr.delete(((sbr.length()) - (suffix.length())), sbr.length());
    this.sql = sbr.toString();
    return this;
}
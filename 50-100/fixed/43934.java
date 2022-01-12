public org.vesalainen.parsers.sql.FetchResult<R, C> describe(java.lang.String tablename) {
    org.vesalainen.parsers.sql.FetchResult fr = new org.vesalainen.parsers.sql.FetchResult(this, "Column", "Count", "Indexed", "Unique");
    org.vesalainen.parsers.sql.TableMetadata tm = org.vesalainen.parsers.sql.Engine.getTableMetadata(tablename);
    if (tm != null) {
        for (org.vesalainen.parsers.sql.ColumnMetadata cm : tm.getColumns()) {
            fr.addRowArray(cm.getName(), cm.getCount(), cm.isIndexed(), cm.isUnique());
        }
    }
    return fr;
}
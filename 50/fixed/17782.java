@java.lang.Override
public java.lang.String load(com.psddev.dari.db.Query<?> query) throws java.lang.Exception {
    return new com.psddev.dari.db.SqlQuery(this, query).selectStatement();
}
public org.dbflute.erflute.db.sqltype.SqlType getType() {
    if ((getFirstReferredColumn()) != null) {
        final org.dbflute.erflute.db.sqltype.SqlType type = getFirstReferredColumn().getType();
        if (org.dbflute.erflute.db.sqltype.SqlType.valueOfId(SqlType.SQL_TYPE_ID_SERIAL).equals(type)) {
            return org.dbflute.erflute.db.sqltype.SqlType.valueOfId(SqlType.SQL_TYPE_ID_INTEGER);
        }else
            if (org.dbflute.erflute.db.sqltype.SqlType.valueOfId(SqlType.SQL_TYPE_ID_BIG_SERIAL).equals(type)) {
                return org.dbflute.erflute.db.sqltype.SqlType.valueOfId(SqlType.SQL_TYPE_ID_BIG_INT);
            }
        
        return type;
    }
    return word.getType();
}
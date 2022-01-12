public java.lang.Object value(java.util.Date value) {
    return value == null ? java.sql.Types.NULL : value.getTime();
}
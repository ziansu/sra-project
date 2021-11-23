public java.sql.Time getTime(java.lang.String columnLabel) throws java.sql.SQLException {
    try {
        java.util.Date date = document.field(columnLabel, OType.DATETIME);
        return getTime(date);
    } catch (java.lang.Exception e) {
        throw new java.sql.SQLException((("An error occurred during the retrieval of the time value at column '" + columnLabel) + "'"), e);
    }
}
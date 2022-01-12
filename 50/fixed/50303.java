public long position(java.sql.Clob arg0, long arg1) throws java.sql.SQLException {
    return position(arg0.getSubString(1L, ((int) (arg0.length()))), arg1);
}
@java.lang.Override
public java.lang.Object mapRow(java.sql.ResultSet arg0, int arg1) throws java.sql.SQLException {
    rv.put(arg0.getString(1), arg0.getLong(2));
    return null;
}
@java.lang.Override
public java.lang.Boolean doInPreparedStatement(java.sql.PreparedStatement ps) throws java.sql.SQLException, org.springframework.dao.DataAccessException {
    ps.setLong(1, userId);
    java.lang.System.out.println(ps);
    return !(ps.execute());
}
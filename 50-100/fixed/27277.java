@java.lang.Override
public void setPreparedStatementValue(java.sql.PreparedStatement ps, int index, java.lang.Object val) throws java.lang.Exception {
    if (val == null) {
        ps.setNull(index, java.sql.Types.VARCHAR);
    }else {
        java.lang.Enum<?> en = ((java.lang.Enum<?>) (val));
        ps.setString(index, en.name());
    }
}
@java.lang.Override
public void setParameter(java.sql.PreparedStatement ps, int i, java.util.Optional<T> parameter, org.apache.ibatis.type.JdbcType jdbcType) throws java.sql.SQLException {
    if (parameter.isPresent())
        super.setParameter(ps, i, parameter, jdbcType);
    else
        throw new java.sql.SQLException("You can`t put into PreparedStatement null values ! ");
    
}
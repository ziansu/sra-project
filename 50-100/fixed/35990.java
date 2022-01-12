public java.lang.Object nullSafeGet(java.sql.ResultSet resultSet, java.lang.String[] names, org.hibernate.engine.spi.SessionImplementor session, java.lang.Object owner) throws java.sql.SQLException {
    java.lang.Object id = type.nullSafeGet(resultSet, names[0], session);
    if ((!(resultSet.wasNull())) && (id != null)) {
        return bidiMap.getEnumValue(id);
    }
    return null;
}
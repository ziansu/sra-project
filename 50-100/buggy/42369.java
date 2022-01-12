public void nullSafeSet(java.sql.PreparedStatement pstmt, java.lang.Object value, int idx, org.hibernate.engine.spi.SessionImplementor session) throws java.sql.SQLException {
    if (value == null) {
        pstmt.setNull(idx, sqlTypes[0]);
    }else {
        type.nullSafeSet(pstmt, bidiMap.getKey(value), idx, null);
    }
}
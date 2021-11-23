public void aplicarDescuento(java.lang.String rut, int descuento) throws java.sql.SQLException {
    java.lang.String sql = "UPDATE EXPORTADORES SET ";
    sql += ("DESCUENTO=" + descuento) + ",";
    sql += (" WHERE RUT = '" + rut) + "'";
    java.sql.PreparedStatement prepStmt = conn.prepareStatement(sql);
    recursos.add(prepStmt);
    prepStmt.executeQuery();
}
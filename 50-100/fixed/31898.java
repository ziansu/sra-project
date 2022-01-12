public java.util.List<java.lang.String> getCategorias() {
    java.util.List<java.lang.String> categorias = new java.util.ArrayList<java.lang.String>();
    try {
        con = com.ibm.conexion.Conexion.init();
        st = con.createStatement();
        rs = st.executeQuery("SELECT NOMBRE FROM CATEGORIA WHERE TIPO='Enlaces'");
        while (rs.next()) {
            categorias.add(rs.getString(1));
        } 
        con.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return categorias;
}
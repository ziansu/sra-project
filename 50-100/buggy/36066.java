public void verificaUsu(java.lang.String user, int cod) {
    try {
        java.sql.DriverManager.registerDriver(new dao.sql.Driver());
        java.sql.Connection conn = java.sql.DriverManager.getConnection(dao.sql.LoginDAO.STRING_CONEXAO);
        java.lang.String sql = "select (login, senha) from forum";
        java.sql.PreparedStatement p = conn.prepareStatement(sql);
        p.setString(1, user);
        p.setInt(2, cod);
        p.execute();
        conn.close();
    } catch (java.sql.SQLException e) {
        java.lang.System.out.println("Erro ao verificar usuário no banco de dados.");
    }
}
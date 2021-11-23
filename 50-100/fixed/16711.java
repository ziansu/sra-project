public void alterar(Model.Estudante estudante) {
    java.lang.String sql = "UPDATE estudantes SET nome = ?, email = ? WHERE id = ?";
    try {
        java.sql.PreparedStatement ps = this.connection.prepareStatement(sql);
        ps.setString(1, estudante.getNome());
        ps.setString(3, estudante.getId());
        ps.execute();
        ps.close();
    } catch (java.sql.SQLException e) {
        throw new java.lang.RuntimeException(e);
    }
}
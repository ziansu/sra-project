public void adicionar(model.Paciente paciente) {
    try {
        java.lang.String query = "insert into paciente (nome, cpf, rg) values (?, ?, ?)";
        java.sql.PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, paciente.getNome());
        preparedStatement.setString(2, paciente.getCpf());
        preparedStatement.setString(3, paciente.getRg());
        preparedStatement.executeUpdate();
        preparedStatement.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
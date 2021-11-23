public java.util.List<br.ufs.dcomp.sigaaweb.model.AlunoBean> findAll() {
    try {
        java.sql.Statement statement = this.getConnection().createStatement();
        java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM alunos");
        while (resultSet.next()) {
            this.alunoBean = extractAlunoBeanFromResultSet(resultSet);
            this.alunoBeans.add(alunoBean);
        } 
        statement.close();
        this.closeConnection();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return this.alunoBeans;
}
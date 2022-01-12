public br.ufs.dcomp.sigaaweb.model.AlunoBean findByMatricula(long matricula) {
    try {
        java.sql.Statement statement = this.getConnection().createStatement();
        java.sql.ResultSet resultSet = statement.executeQuery(("SELECT * FROM alunos WHERE cod_matricula=" + matricula));
        if (resultSet.next()) {
            this.alunoBean = extractAlunoBeanFromResultSet(resultSet);
        }
        statement.close();
        this.closeConnection();
    } catch (java.lang.Exception e) {
        this.closeConnection();
        e.printStackTrace();
    }
    return this.alunoBean;
}
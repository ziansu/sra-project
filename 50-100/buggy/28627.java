public java.sql.ResultSet consultaCodigo(int parseInt) {
    sql.delete(0, sql.length());
    sql.append("SELECT * FROM CONTA WHERE CD_CONTA = ");
    sql.append(br.edu.grupointegrado.controle.ClassConta.getCdConta());
    executeSQL(sql.toString());
    return resultset;
}
public boolean alterarSenha(java.lang.String cpf, java.lang.String novaSenha) {
    boolean ok = false;
    try {
        poo.negocios.beans.Pessoa a = this.buscarPessoa(cpf);
        a.setSenha(novaSenha);
        command.atualiza(a);
        ok = true;
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    return ok;
}
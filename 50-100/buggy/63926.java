public util.Resposta validar(classes.entidades.Filial filial) throws java.lang.ClassNotFoundException, java.sql.SQLException {
    util.Resposta resposta = new util.Resposta();
    if (!(util.Funcoes.isCNPJ(filial.getCnpj()))) {
        resposta.setErro("Este CNPJ é inválido.", "cnpj");
    }
    if (DAO.FilialDAO.cnpjJaCadastrado(filial.getCnpj())) {
        resposta.setErro("Esse CNPJ já está cadastrado", "cnpj");
    }
    return resposta;
}
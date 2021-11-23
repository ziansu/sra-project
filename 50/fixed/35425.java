public void salvar(dominio.Pessoa pessoa) {
    DAO.PessoaDAO pessoaDao = new DAO.PessoaDAO();
    if ((validate(pessoa)) == true) {
        pessoaDao.salvar(pessoa);
    }
}
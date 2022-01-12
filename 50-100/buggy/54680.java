public void inserir(br.ufc.banco.conta.ContaAbstrata conta) throws br.ufc.banco.dados.excecoes.CEException {
    if ((this.procurar(conta.obterNumero())) != null) {
        this.contas.addElement(conta);
    }else {
        throw new br.ufc.banco.dados.excecoes.CEException(conta.obterNumero());
    }
}
public br.ufc.banco.conta.ContaAbstrata procurar(java.lang.String numero) {
    br.ufc.banco.conta.ContaAbstrata conta = null;
    if ((this.contas.size()) > 0) {
        for (int i = 0; i < (this.contas.size()); i++) {
            conta = ((br.ufc.banco.conta.ContaAbstrata) (this.contas.elementAt(i)));
            if (conta.obterNumero().equals(numero)) {
                return conta;
            }
        }
    }
    return null;
}
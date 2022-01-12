public br.ufc.banco.conta.ContaAbstrata procurar(java.lang.String numero) {
    if ((this.contas.size()) > 0) {
        for (br.ufc.banco.conta.ContaAbstrata c : contas) {
            if ((c != null) && (c.obterNumero().equals(numero)))
                return c;
            
        }
    }
    return null;
}
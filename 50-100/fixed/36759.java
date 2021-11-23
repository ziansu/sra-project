public br.ufc.banco.conta.ContaAbstrata procurar(java.lang.String numero) {
    if ((this.contas.size()) > 0) {
        for (br.ufc.banco.conta.ContaAbstrata c : contas) {
            java.lang.System.out.println(c.obterNumero());
            if ((c != null) && (c.obterNumero().equals(numero)))
                return c;
            
        }
    }
    return null;
}
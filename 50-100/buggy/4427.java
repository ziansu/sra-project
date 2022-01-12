public br.ufc.banco.conta.ContaAbstrata[] listar() {
    br.ufc.banco.conta.ContaAbstrata[] lista = null;
    if ((this.contas.size()) > 0) {
        lista = new br.ufc.banco.conta.ContaAbstrata[this.contas.size()];
        for (int i = 0; i < (this.contas.size()); i++) {
            lista[i] = ((br.ufc.banco.conta.ContaAbstrata) (this.contas.elementAt(i)));
        }
    }
    return lista;
}
public java.util.ArrayList<br.ufc.banco.conta.ContaAbstrata> listar() {
    java.util.ArrayList<br.ufc.banco.conta.ContaAbstrata> lista = null;
    if ((this.contas.size()) > 0) {
        lista = new java.util.ArrayList<br.ufc.banco.conta.ContaAbstrata>(this.contas.size());
        for (int i = 0; i < (this.contas.size()); i++) {
            lista.add(((br.ufc.banco.conta.ContaAbstrata) (this.contas.elementAt(i))));
        }
    }
    return lista;
}
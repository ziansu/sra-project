public double saldoTotal() {
    double saldo = 0;
    if ((this.repositorio.numeroContas()) > 0) {
        java.util.ArrayList<br.ufc.banco.conta.ContaAbstrata> contas = this.repositorio.listar();
        for (int i = 0; i < (contas.size()); i++) {
            saldo += contas.get(i).obterSaldo();
        }
    }
    return saldo;
}
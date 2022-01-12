public double saldoTotal() {
    double saldo = 0;
    if ((this.repositorio.numeroContas()) > 0) {
        br.ufc.banco.conta.ContaAbstrata[] contas = this.repositorio.listar();
        for (int i = 0; i < (contas.length); i++) {
            saldo += contas[i].obterSaldo();
        }
    }
    return saldo;
}
public java.lang.String get_tabela_string() {
    java.lang.String tabela_string = "";
    if (this.tabelaRoteamento.isEmpty()) {
        tabela_string = "!";
    }else {
        for (roteador.EntradaTabelaRoteamento entrada : this.tabelaRoteamento) {
            tabela_string = (((tabela_string + "*") + (entrada.getIpDestino())) + ";") + (entrada.getMetrica());
        }
    }
    return tabela_string;
}
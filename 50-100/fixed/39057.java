private java.lang.Boolean metricIsLower(roteador.Tabela newLine) {
    for (roteador.Tabela tabelaRot : tabelaRoteamento) {
        if ((tabelaRot.getIp_destino().equals(newLine.getIp_destino())) && ((tabelaRot.getMetrica()) > (newLine.getMetrica()))) {
            return true;
        }
    }
    return false;
}
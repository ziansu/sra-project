public static void carrega(java.util.LinkedList<Processo> listaProcessos, int q) throws java.io.IOException {
    Prioridades.quantum = q;
    Prioridades.tabelaProcesso = Prioridades.carregaBCP(listaProcessos);
    Prioridades.ordena(Prioridades.tabelaProcesso);
    Prioridades.executa();
}
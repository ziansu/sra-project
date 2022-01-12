private int calcularDondeTerminaLaLista(java.util.List<java.lang.String> listaDeEntrada, int comienzoDeLaLista) {
    int i = comienzoDeLaLista;
    for (int j = i; j < (listaDeEntrada.size()); j++) {
        if (listaDeEntrada.get(j).startsWith("*")) {
            i++;
        }
    }
    return i - 1;
}
private int menorDentreAs(double[] razoes) {
    double menor = razoes[0];
    int indice = 0;
    for (int i = 1; i < (razoes.length); i++) {
        if ((razoes[i]) > 0) {
            if ((java.lang.Double.compare(razoes[i], menor)) < 0) {
                menor = razoes[i];
                indice = i;
            }
        }
    }
    return indice;
}
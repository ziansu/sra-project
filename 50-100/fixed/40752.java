public static void setVariavel(Variavel v, Variavel[] seq) {
    int aux;
    for (aux = 0; aux < (seq.length); aux++) {
        if ((seq[aux]) == null) {
            seq[aux] = v;
            return ;
        }
    }
    return ;
}
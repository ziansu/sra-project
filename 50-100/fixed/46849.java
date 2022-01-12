private java.lang.Integer getAvailableCores(int nbCores) {
    int max = 0;
    java.lang.Integer index = -1;
    for (int i = 0; i < (nbAvailablesCores.length); i++) {
        if ((nbAvailablesCores[i]) == nbCores) {
            return i;
        }
        if ((nbAvailablesCores[i]) > max) {
            max = nbAvailablesCores[i];
            index = i;
        }
    }
    return index;
}
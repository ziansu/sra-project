java.util.List<java.lang.Integer> next(java.util.Set<java.lang.Integer> blank, int ghostIndex) {
    java.util.Set<java.lang.Integer> gis = new java.util.HashSet<>();
    for (int i = 0; i < (ghostNum); i++) {
        gis.add(ghostI2V[i]);
    }
    return next(blank, ghostI2V[ghostIndex], gis);
}
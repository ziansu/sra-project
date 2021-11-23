java.util.List<java.lang.Integer> next(int ghostIndex) {
    java.util.Set<java.lang.Integer> gis = new java.util.HashSet<>();
    for (int i = 0; i < (ghostNum); i++) {
        gis.add(ghostI2V[i]);
    }
    return next(ghostI2V[ghostIndex], gis);
}
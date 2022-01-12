public void populate() {
    int alphaIndex = 0;
    for (int i = 0; i < (gridDis.length); i++) {
        for (int u = 0; u < (gridDis[1].length); u++) {
            gridDis[i][u] = ALPHABET[alphaIndex];
            alphaIndex++;
        }
    }
}
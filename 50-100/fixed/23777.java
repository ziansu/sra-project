public boolean isSolution() {
    int nbPegsFilled = 0;
    int[][] tabCases = p.getTabCases();
    for (int i = 0; i < (tabCases.length); i++) {
        for (int j = 0; j < (tabCases.length); j++) {
            if ((tabCases[i][j]) == (IS_FILLED)) {
                nbPegsFilled += 1;
            }
        }
    }
    return nbPegsFilled == (IS_FILLED) ? true : false;
}
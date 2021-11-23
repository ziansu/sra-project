private java.lang.Character getRandomSymbol(float[] row) {
    float right = 0;
    float currRandom = rnd.nextFloat();
    java.lang.Character randomCharacter = null;
    for (int i = 0; i != (row.length); i++) {
        right += cfg.getMatrixProb()[0][i];
        if (currRandom <= right) {
            randomCharacter = cfg.getSymbols()[i];
            break;
        }
    }
    return randomCharacter;
}
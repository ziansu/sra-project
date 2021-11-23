public int generatePseudoRandomWallNumberMinMax(int min, int max) {
    java.util.Random generator = new java.util.Random(currentSeed);
    double result = java.lang.Math.abs((((double) ((generator.nextLong()) % 0.001)) * 1000));
    int wallNumber = min + ((int) (result * ((max - min) + 1)));
    (currentSeed)--;
    return wallNumber;
}
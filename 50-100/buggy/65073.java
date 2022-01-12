public java.lang.Integer[] generateRandIndividual(int noi, java.util.Random rg) {
    java.util.Random randomGenerator = rg;
    java.lang.Integer[] individual = new java.lang.Integer[numberOfRSUs];
    for (int i = 0; i < (numberOfRSUs); i++) {
        individual[i] = -1;
    }
    for (int i = 0; i < (numberOfRSUs); i++) {
        individual[i] = insert(randomGenerator, individual, noi);
    }
    return individual;
}
public java.util.ArrayList<java.lang.Integer> generateRandIndividual(int noi, java.util.Random rg) {
    java.util.Random randomGenerator = rg;
    java.util.ArrayList<java.lang.Integer> individual = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < (numberOfRSUs); i++) {
        individual.add(insert(randomGenerator, individual, noi));
    }
    return individual;
}
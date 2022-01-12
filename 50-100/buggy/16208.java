public void initialiseMainCaseNoir(int nbClient) {
    int max = nbClient;
    java.util.Random randomGenerator = new java.util.Random();
    int index;
    for (int i = 0; i < (max * 16); i++) {
        index = randomGenerator.nextInt(casesDisponible.size());
        java.lang.String c = casesDisponible.get(index);
        plateauMap.get(c).setEtat(1);
        casesDisponible.remove(c);
    }
}
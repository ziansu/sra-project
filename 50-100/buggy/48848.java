private void createInitialPopulation() {
    java.util.Random rand = new java.util.Random(83);
    currentGeneration = new java.util.ArrayList<br.edu.univas.si7.se.ag.Individual>();
    for (int i = 0; i < (AGParameters.POPULATION_SIZE); i++) {
        int x = rand.nextInt(127);
        java.lang.String rawInfo = java.lang.Integer.toBinaryString(x);
        java.lang.String info = java.lang.String.format("%7s", rawInfo).replace(' ', '0');
        currentGeneration.add(new br.edu.univas.si7.se.ag.Individual(info));
    }
}
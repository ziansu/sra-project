private static travellingappraiser.geneticAlgorithm.Tour tournamentSelection(travellingappraiser.geneticAlgorithm.Population pop) {
    travellingappraiser.geneticAlgorithm.Population tournament = new travellingappraiser.geneticAlgorithm.Population(travellingappraiser.geneticAlgorithm.Algorithm.tournamentSize, false);
    for (int i = 0; i < (travellingappraiser.geneticAlgorithm.Algorithm.tournamentSize); i++) {
        int randomId = ((int) ((java.lang.Math.random()) * (pop.size())));
        tournament.saveIndividual(i, pop.getIndividual(randomId));
    }
    travellingappraiser.geneticAlgorithm.Tour fittest = tournament.getFittest();
    return fittest;
}
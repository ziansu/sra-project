private void findBestFitness() {
    java.util.List<chromosome.ChromosomeRepresentationInterface> chromosomesCopy = new java.util.ArrayList(chromosomes);
    chromosomesCopy.sort(new evolver.Population.ChromosomeFitnessComparator());
    chromosomes = chromosomesCopy;
    bestIndividuals = chromosomes;
}
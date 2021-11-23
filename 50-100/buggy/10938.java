public java.util.List<hr.fer.tki.evolution_algorithm.chromosome.IChromosome> getBestSolutions(int num) {
    java.util.List<hr.fer.tki.evolution_algorithm.chromosome.IChromosome> solutions = new java.util.ArrayList<>();
    this.evaluatePopulation(this.population);
    this.sortPopulation();
    for (int i = 0; i < num; i++) {
        solutions.add(this.population.get(i));
    }
    for (hr.fer.tki.evolution_algorithm.chromosome.IChromosome chromosome : solutions) {
        java.lang.System.out.println(chromosome.getFitness());
    }
    return solutions;
}
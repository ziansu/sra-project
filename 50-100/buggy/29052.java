private void evaluateFitness(java.util.ArrayList<main.brain.learner.genetic.Gene<E>> genes) {
    for (main.brain.learner.genetic.Gene<E> gene : genePool) {
        if ((gene.getFitness()) == (Gene.INITIAL_FITNESS)) {
            double fitness = fitnessFunction.evaluateFitness(gene);
            gene.setFitness(fitness);
        }
    }
}
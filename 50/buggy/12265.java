public main.brain.learner.genetic.Gene<E> getFittest() {
    return populationSelector.selectElite(genePool).get(0);
}
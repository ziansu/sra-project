private java.util.ArrayList<main.brain.learner.genetic.Gene<E>> selectElite(java.util.ArrayList<main.brain.learner.genetic.Gene<E>> genes, int num) {
    return populationSelector.selectElite(genes, num);
}
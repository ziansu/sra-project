@java.lang.Override
public void cull(java.util.ArrayList<main.brain.learner.genetic.Gene<E>> genePool, int num) {
    java.util.Collections.sort(genePool);
    int size = genePool.size();
    for (int i = 1; i <= num; i++) {
        genePool.remove((size - i));
    }
}
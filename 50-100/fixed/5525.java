public void mutate(int currentGeneration, java.util.Map mutationMap) {
    lethalMutate();
    if (isAlive()) {
        deleteriousMutate(currentGeneration, mutationMap);
        beneficialMutate(currentGeneration, mutationMap);
        mutatorMutate(currentGeneration);
    }
    if ((getFitness(mutationMap)) <= 0) {
        die();
    }
}
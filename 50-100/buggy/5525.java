public void mutate(int currentGeneration, java.util.Map mutationMap, java.util.Map mutationProperties) {
    lethalMutate();
    if (isAlive()) {
        deleteriousMutate(currentGeneration, mutationMap, mutationProperties);
        beneficialMutate(currentGeneration, mutationMap, mutationProperties);
        mutatorMutate(currentGeneration);
    }
    if ((getFitness(mutationMap)) <= 0) {
        die();
    }
}
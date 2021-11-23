public void mutate(int currentGeneration, java.util.Map mutationMap, java.util.Map mutationProperties) {
    getIndividualA().mutate(currentGeneration, mutationMap, mutationProperties);
    getIndividualB().mutate(currentGeneration, mutationMap, mutationProperties);
}
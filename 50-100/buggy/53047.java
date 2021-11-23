public void localSearchStage(int iteration) {
    localSearch1.setData(Population, totalExaminedSolution, maxNeighborhood);
    localSearch1.setData(Population, archieve, currentUsedSolution, iteration);
    localSearch1.setObjectives(ObjectiveFunction);
    localSearch1.startLocalSearch();
    currentUsedSolution += localSearch1.getCurrentUsedSolution();
}
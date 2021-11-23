public void constructSolution() {
    int k = 1;
    int i;
    while (k <= (setup.Parameters.getNumOfWeapons())) {
        i = findTargetIndexForWeapon(k);
        allocations.add(i);
        updatePheromoneValuesLocally(k);
        setup.Parameters.setTargetValue(i, ((setup.Parameters.getTargetValue(i)) * (1 - (setup.Parameters.getKillProbability(i, k)))));
        setup.Parameters.calculateHeuristicValues();
        k++;
    } 
    solutionValue = calculateSolution(allocations);
}
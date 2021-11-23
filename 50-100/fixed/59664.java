public void constructSolution() {
    int i;
    for (int k = 0; k < (setup.Parameters.getNumOfWeapons()); k++) {
        i = findTargetIndexForWeapon(k);
        allocations.add(i);
        updatePheromoneValuesLocally(k);
        setup.Parameters.setTargetValue(i, ((setup.Parameters.getTargetValue(i)) * (1 - (setup.Parameters.getKillProbability(i, k)))));
        setup.Parameters.calculateHeuristicValues();
    }
    solutionValue = calculateSolution(allocations);
}
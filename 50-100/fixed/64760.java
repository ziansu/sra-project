private void normaliseObjective(java.util.List<evochecker.genetic.jmetal.single.Solution> solutionList) {
    double maxCost = 0;
    for (evochecker.genetic.jmetal.single.Solution solution : solutionList) {
        double cost = solution.getObjective(1);
        if (cost > maxCost)
            maxCost = cost;
        
    }
    for (evochecker.genetic.jmetal.single.Solution solution : solutionList) {
        double cost = solution.getObjective(1);
        solution.setObjective(1, (cost / maxCost));
    }
}
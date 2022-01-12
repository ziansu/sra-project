private void evaluateObj0(java.util.List<evochecker.genetic.jmetal.single.Solution> solutionList) {
    for (evochecker.genetic.jmetal.single.Solution solution : solutionList) {
        double w = 0.9;
        double evaluation = (w * (solution.getObjective(3))) + ((1 - w) * (solution.getObjective(2)));
        solution.setObjective(0, evaluation);
    }
}
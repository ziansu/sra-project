private void evaluateObj0(java.util.List<evochecker.genetic.jmetal.single.Solution> solutionList) {
    for (evochecker.genetic.jmetal.single.Solution solution : solutionList) {
        double w = 0.9;
        double evaluation = (w * (solution.getObjective(0))) + ((1 - w) * (solution.getObjective(1)));
        solution.setObjective(0, evaluation);
    }
}
public void findNewSolution() {
    final com.github.pjpo.planning.problem.PlanningForIntervalSolver solver = new com.github.pjpo.planning.problem.PlanningForIntervalSolver(physicians, positions, positionsConstraints, previousAcceptedSolutions);
    final com.github.pjpo.planning.model.Solution newSolution = solver.findSolution();
    if (((previousAcceptedSolutions.size()) > 0) && ((newSolution.getWorkLoadSD()) <= (previousAcceptedSolutions.getLast().getWorkLoadSD()))) {
        previousAcceptedSolutions.addFirst(newSolution);
    }
}
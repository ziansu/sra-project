public boolean findNewSolution() {
    final com.github.pjpo.planning.problem.PlanningForIntervalSolver solver = new com.github.pjpo.planning.problem.PlanningForIntervalSolver(physicians, positions, positionsConstraints, previousAcceptedSolutions);
    final com.github.pjpo.planning.model.Solution newSolution = solver.findSolution();
    if (newSolution == null) {
        return false;
    }else {
        if (((previousAcceptedSolutions.size()) > 0) && ((newSolution.getWorkLoadSD()) <= (previousAcceptedSolutions.getLast().getWorkLoadSD()))) {
            previousAcceptedSolutions.addFirst(newSolution);
        }
        return true;
    }
}
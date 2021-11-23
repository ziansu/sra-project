private void processGroupsGenSolutions(com.kenkensolver.data.Puzzle p) {
    for (com.kenkensolver.data.BespokeGroup bg : p.getBespokeGroups()) {
        bg.generatePossibleSolutions();
        java.util.Set<java.util.List<java.lang.Integer>> possibleSolutions = bg.getPossibleSolutions();
    }
}
private void findAllTargets(experiment.BoardCell startcell, int numsteps) {
    java.util.Set<experiment.BoardCell> adj = getAdjList(startcell);
    java.lang.System.out.println(adj);
    for (experiment.BoardCell cell : adj) {
        if (visited.contains(cell)) {
            break;
        }else {
            visited.add(cell);
            if (numsteps == 1) {
                targets.add(cell);
            }else {
                findAllTargets(cell, (numsteps - 1));
            }
        }
        visited.remove(cell);
    }
}
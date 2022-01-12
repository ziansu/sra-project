public void backTrack(game.ExplorationState state) {
    pathTaken.pop();
    do {
        java.lang.System.out.println();
        lastPopped = pathTaken.pop();
        state.moveTo(lastPopped);
    } while (!(unvisitedNeighbours(state)) );
    pathTaken.push(lastPopped);
}
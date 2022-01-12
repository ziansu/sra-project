public void backTrack(game.ExplorationState state) {
    pathTaken.pop();
    java.lang.System.out.println("backtrack");
    do {
        if ((earlierVisitInStack(state)) != (state.getCurrentLocation())) {
            state.moveTo(earlierVisitInStack(state));
            java.lang.System.out.println("backtrack");
        }else {
            java.lang.System.out.println();
            lastPopped = pathTaken.pop();
            state.moveTo(lastPopped);
        }
    } while (!(unvisitedNeighbours(state)) );
    pathTaken.push(lastPopped);
}
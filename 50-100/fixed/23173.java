public void set(java.awt.Point p, sample.Tile owner) {
    sample.states.BoardState nextState;
    try {
        nextState = new sample.states.BoardState(currentState.get(), sample.Connect4Board.turnOrder.get((((sample.Connect4Board.turnOrder.indexOf(owner)) + 1) % (sample.Connect4Board.turnOrder.size()))));
    } catch (sample.InvalidBoardException e) {
        e.printStackTrace();
        java.lang.System.err.println("Something went wrong!");
        return ;
    }
    nextState.set(p, owner);
    currentState.setValue(nextState);
}
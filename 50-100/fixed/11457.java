public int fitnessValue() {
    State s = new State();
    while (!(s.hasLost())) {
        s.makeMove(this.pickMove(s, s.legalMoves()));
    } 
    return s.getRowsCleared();
}
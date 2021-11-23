public int fitnessValue() {
    State s = new State();
    while (!(s.hasLost())) {
        s.makeMove(this.pickMove(s, s.legalMoves()));
    } 
    java.lang.System.out.println(s.getRowsCleared());
    return s.getRowsCleared();
}
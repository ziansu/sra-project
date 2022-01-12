private java.awt.Point[] getGoal(boolean first) {
    int x = (first) ? (State.MIN_X) + 1 : (State.MAX_X) - 1;
    return new java.awt.Point[]{ new java.awt.Point(x, 1) , new java.awt.Point(x, 2) };
}
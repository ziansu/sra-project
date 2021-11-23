public int moves() {
    int moves = 0;
    if (!(isSolvable())) {
        moves = -1;
    }else {
        moves = goal.moves;
    }
    return moves;
}
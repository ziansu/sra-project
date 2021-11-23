public void move(int i, int j) {
    if ((tablePlays.size()) == 0) {
        turn = turn.opposite();
        verify();
        return ;
    }
    eat(i, j);
    if ((table[i][j]) == (turn)) {
        turn = turn.opposite();
    }
    verify();
}
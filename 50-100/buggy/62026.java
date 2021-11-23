public void move(int i, int j) {
    if ((tablePlays.size()) == 0) {
        turn = turn.opposite();
        verify();
    }
    eat(i, j);
    if ((table[i][j]) == null) {
        return ;
    }
    turn = turn.opposite();
    verify();
}
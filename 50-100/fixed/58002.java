private void leftUpDiagonal(int x) {
    int n = 0;
    for (int i = this.x; i >= x; i--) {
        validMovesList.add(new htwg.util.Point(((this.x) - n), ((this.y) + n)));
        n++;
    }
}
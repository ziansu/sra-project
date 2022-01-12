public boolean isEmpty(Game.Position pos) {
    if (((pos.i) >= (row)) || ((pos.j) >= (col))) {
        return false;
    }else {
        return matrix.get((((pos.i) * (col)) + (pos.j)));
    }
}
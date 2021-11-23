public boolean isEmpty(Game.Position pos) {
    if (((((pos.i) < 0) || ((pos.i) >= (row))) || ((pos.j) < 0)) || ((pos.j) >= (col))) {
        return false;
    }else {
        return matrix.get((((pos.i) * (col)) + (pos.j)));
    }
}
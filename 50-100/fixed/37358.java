public boolean move(Board.Tile t) {
    int diag = checkDiag(t);
    if (diag > 0) {
        createRoute(t, diag);
        if ((checkRoute(t)) == t) {
            this.x = t.getX();
            this.y = t.getY();
            return true;
        }
    }
    return false;
}
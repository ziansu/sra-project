public boolean move(Board.Tile t) {
    boolean val = false;
    int diag = checkDiag(t);
    if (diag > 0) {
        createRoute(t, diag);
        if ((checkRoute(t)) == t) {
            this.x = t.getX();
            this.y = t.getY();
            val = true;
        }
    }else
        val = false;
    
    return val;
}
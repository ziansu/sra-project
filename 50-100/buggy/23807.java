public void move(Move m) {
    if (Logic.validMove(this, m)) {
        java.lang.System.out.println("valid");
        this.setField(m.getStart(), null);
        this.setField(m.getDestination(), m.getFigure());
        whitesTurn = !(whitesTurn);
        draw();
    }else
        java.lang.System.out.println("invalid");
    
}
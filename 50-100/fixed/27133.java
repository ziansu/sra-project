com.letitgo.Montecarlo.Node addChild(com.letitgo.Point p) {
    com.letitgo.Montecarlo.Node child;
    if ((children) == null)
        children = new java.util.ArrayList<com.letitgo.Montecarlo.Node>();
    
    child = new com.letitgo.Montecarlo.Node(this, this.board, p, com.letitgo.Board.getOppositeSide(stoneType));
    children.add(child);
    return child;
}
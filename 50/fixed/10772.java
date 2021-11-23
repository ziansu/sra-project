public boolean isKingInSet(Game.Desk d, Game.Colour col, java.util.HashSet<Game.Position> set) {
    for (Game.Position pos : set) {
        if ((d.getCell(pos).getFigure()) instanceof Game.Figure.King)
            return true;
        
    }
    return false;
}
public Board.Tile checkRoute(Board.Tile goal) {
    Board.Tile returnTile = null;
    for (int i = 0; i < (route.size()); i++) {
        if ((route.get(i).getType()) == 0) {
            returnTile = null;
        }else
            returnTile = goal;
        
    }
    return returnTile;
}
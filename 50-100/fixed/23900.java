public Board.Tile checkRoute(Board.Tile goal) {
    for (int i = 0; i < (route.size()); i++) {
        if ((route.get(i).getType()) == 0) {
            return null;
        }
    }
    return goal;
}
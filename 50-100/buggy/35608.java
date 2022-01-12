public artGame.game.Coordinate nextCoord() {
    if ((path) != null) {
        artGame.game.Coordinate current = new artGame.game.Coordinate(this.col, this.row);
        int step = path.indexOf(current);
        if (step == (path.size()))
            step = 0;
        
        return path.get((step + 1));
    }else
        return new artGame.game.Coordinate(this.col, this.row);
    
}
public artGame.game.Coordinate nextCoord() {
    if ((path) != null) {
        artGame.game.Coordinate current = new artGame.game.Coordinate(this.col, this.row);
        int step = path.indexOf(current);
        step = step + 1;
        if (step == (path.size()))
            step = 0;
        
        return path.get(step);
    }else
        return new artGame.game.Coordinate(this.col, this.row);
    
}
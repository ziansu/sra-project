protected void removeStones(myPackage.GemsMatch match) {
    if (match.coords.isEmpty()) {
        return ;
    }
    for (myPackage.Coordinates c : match.coords) {
        board[c.x][c.y] = myPackage.Utils.MAP_GEM.EMPTY;
    }
}
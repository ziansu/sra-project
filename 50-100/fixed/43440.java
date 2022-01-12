public void goToTile(StrongholdCrusader.Map.MapTile[][] tiles, StrongholdCrusader.Map.MapTile tile) {
    targetTile = tile;
    java.util.LinkedList<StrongholdCrusader.Map.MapTile> path = findRoute(tiles, tiles[position.x][position.y], targetTile, canClimb);
    if ((path.size()) != 0) {
        path.removeLast();
        this.nextTile = path.getLast();
    }
}
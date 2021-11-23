protected void handleNextTileIsEdge(float time, com.esbjon.mapobjects.Tile nextTile) {
    if (usePathFinder) {
        this.followPath();
        this.allowYchange = true;
    }else
        if (!(currentTile.isConnected(nextTile))) {
            if ((this) instanceof com.esbjon.entities.Squad) {
                java.lang.System.out.println("Moving entity Warning: moving into a map edge");
            }
        }
    
}
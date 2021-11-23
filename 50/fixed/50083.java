protected void handleNextTileIsSafe(float time, com.esbjon.mapobjects.Tile nextTile) {
    if (usePathFinder) {
        if (nextTile == (ePath.get(pathIndex)))
            this.followPath();
        
    }
}
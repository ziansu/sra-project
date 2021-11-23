public void setInitialTarget(com.esbjon.entities.Entity target, com.esbjon.mapobjects.Tile toTile) {
    if (target != null)
        this.playerAssignTarget(target, false);
    else
        if (toTile != null)
            this.playerAssignGoTo(toTile, bufferVect.set(toTile.getmX(), toTile.getYAtCenter(), toTile.getmZ()), false);
        
    
}
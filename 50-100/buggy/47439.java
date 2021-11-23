@java.lang.Override
public void entityLostSightNotice(com.esbjon.mapobjects.VicinityReference sightedEntity) {
    if (sightedEntity instanceof com.esbjon.entities.Substance) {
        if ((sightedEntity == (watchObject)) && ((state) != (com.esbjon.entities.SteeringEntity.behaviorState.CHASE))) {
            com.esbjon.mapobjects.Tile sightedTile = watchObject.currentTile;
            bufferVect.set(sightedTile.getmX(), 0.0F, sightedTile.getmZ());
            this.goTo(watchObject.currentTile, bufferVect);
        }
    }else
        if (sightedEntity instanceof com.esbjon.entities.Shuttle) {
            java.lang.System.out.println("Wolf lost sight of shuttle");
        }
    
}
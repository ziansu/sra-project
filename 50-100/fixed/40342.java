private void handleDisjunctionNotices() {
    while ((com.esbjon.mapobjects.TileVicinity.removedVicinities.size) > 0) {
        com.esbjon.mapobjects.TileVicinity vicinity = com.esbjon.mapobjects.TileVicinity.removedVicinities.pop();
        vicinity.overlapVicinities.removeValue(this, false);
        if (!(vicinity.disjunctVicinities.contains(this, false)))
            vicinity.disjunctVicinities.add(this);
        
        com.esbjon.entities.MovingEntity entity = vicinity.getRefEntity();
        if ((entity != null) && ((refEntity) != null)) {
            entity.vicinityDisjunctionNotice(refEntity);
            refEntity.vicinityDisjunctionNotice(entity);
        }
    } 
}
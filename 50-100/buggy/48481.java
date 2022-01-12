public void updateAllEntities() {
    this.currentEntities = new java.util.ArrayList<com.ichmed.bol2d.world.Entity>(this.nextEntities);
    for (com.ichmed.bol2d.world.Entity e : getEntitesInUpdateRange())
        e.onUpdate();
    
    for (com.ichmed.bol2d.world.Entity e : entitiesToCleanup)
        e.performCleanup();
    
}
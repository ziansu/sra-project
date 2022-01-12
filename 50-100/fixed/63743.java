public boolean addEntity(com.totemdefender.entities.Entity ent, int depth) {
    if (ent == null)
        return false;
    
    if (!(ent.isSpawned()))
        return false;
    
    com.totemdefender.DepthWrapper<com.totemdefender.entities.Entity> wrapper = new com.totemdefender.DepthWrapper<com.totemdefender.entities.Entity>();
    wrapper.depth = depth;
    wrapper.object = ent;
    return entityAddQueue.add(wrapper);
}
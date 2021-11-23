public boolean destroyEntity(com.totemdefender.entities.Entity ent) {
    if (!(entityDeleteQueue.contains(ent)))
        return entityDeleteQueue.add(ent);
    
    return false;
}
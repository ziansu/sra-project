public void remove(scibby.entities.Entity entity) {
    if ((scibby.level.Level.currentLevel) == 0)
        return ;
    
    if (entity instanceof scibby.entities.Mob) {
        mobs.remove(((scibby.entities.Mob) (entity)));
    }else
        if (entity instanceof scibby.entities.Particle) {
            particles.remove(((scibby.entities.Particle) (entity)));
        }else {
            entities.remove(entity);
        }
    
}
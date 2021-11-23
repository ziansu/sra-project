public void add(scibby.entities.Entity entity) {
    if ((scibby.level.Level.currentLevel) == 0)
        return ;
    
    if (entity instanceof scibby.entities.Mob) {
        mobs.add(((scibby.entities.Mob) (entity)));
    }else
        if (entity instanceof scibby.entities.Particle) {
            particles.add(((scibby.entities.Particle) (entity)));
        }
    
    entities.add(entity);
}
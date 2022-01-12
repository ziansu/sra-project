public static boolean add(final com.github.jotask.neat.engine.entity.Entity entity) {
    if ((com.github.jotask.neat.engine.EntityManager.instance) == null)
        com.github.jotask.neat.engine.EntityManager.get();
    
    if (entity == null)
        return false;
    
    if (entity instanceof com.github.jotask.neat.engine.entity.Enemy) {
        (com.github.jotask.neat.engine.EntityManager.instance.enemies)++;
    }
    return com.github.jotask.neat.engine.EntityManager.instance.entities.add(entity);
}
public void process(java.util.List<com.StarDust.entity.Entity> entities, double deltaTime) {
    for (com.StarDust.entity.Entity e : entities) {
        if (e.hasComponents(getRequiredComponents())) {
            process(deltaTime, e);
        }
    }
}
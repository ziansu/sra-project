public void addEntity(me.grantammons.rogueEngine.core.entities.AnimatedEntity e) {
    repeat.add(e);
    queue.add(e, e.getSpeed());
}
@com.jenjinstudios.world.reflection.DynamicMethod
protected com.jenjinstudios.world.actor.NewlyInvisibleEvent observePostUpdate(com.jenjinstudios.world.actor.Actor actor) {
    java.util.Collection<com.jenjinstudios.world.object.WorldObject> current = actor.getVision().getVisibleObjects();
    lastVisible.removeAll(current);
    com.jenjinstudios.world.actor.NewlyInvisibleEvent newlyInvisibleEvent = null;
    if (!(current.isEmpty())) {
        newlyInvisibleEvent = new com.jenjinstudios.world.actor.NewlyInvisibleEvent(actor, lastVisible);
    }
    lastVisible = current;
    return newlyInvisibleEvent;
}
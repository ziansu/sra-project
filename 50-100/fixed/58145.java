@java.lang.Override
protected void update(double delta) {
    runtime += delta;
    collidableController.update(chunkService.getChunk(movableController.getPlayer().get3DPos()).getStaticObjects());
    movableController.updateMovables(((float) (delta)), runtime, true);
    if (collidableController.isRemoved()) {
        hills.controller.manager.ICollidable collidable = collidableController.getObjectToRemove();
        renderController.removeObject(collidable);
    }
}
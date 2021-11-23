@java.lang.Override
protected void update(double delta) {
    runtime += delta;
    movableController.updateMovables(((float) (delta)), runtime, true);
    collidableController.update(chunkService.getChunk(movableController.getPlayer().get3DPos()).getStaticObjects());
    if (collidableController.isRemoved()) {
        hills.controller.manager.ICollidable collidable = collidableController.getObjectToRemove();
        renderController.removeObject(collidable);
        collidable = null;
    }
}
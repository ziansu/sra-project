public void deregisterEntity(maelstrom.entity.GameEntity entity) {
    int entityIndex = entities.indexOf(entity);
    if (entityIndex == (-1)) {
        return ;
    }
    entities.remove(entityIndex);
}
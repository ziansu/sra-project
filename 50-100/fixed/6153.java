private org.terasology.entitySystem.entity.EntityRef doBushGrowth(org.terasology.simpleFarming.components.BushDefinitionComponent bushComponent, int direction) {
    bushComponent.currentStage += direction;
    worldProvider.setBlock(bushComponent.position, bushComponent.stages[bushComponent.currentStage].block);
    org.terasology.entitySystem.entity.EntityRef newBush = blockEntityRegistry.getBlockEntityAt(bushComponent.position);
    newBush.addOrSaveComponent(bushComponent);
    return newBush;
}
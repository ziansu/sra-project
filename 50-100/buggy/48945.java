@org.terasology.entitySystem.event.ReceiveEvent
public void onSpawnStructureEvent(org.terasology.structureTemplates.events.StructureBlocksSpawnedEvent event, org.terasology.entitySystem.entity.EntityRef entity, org.terasology.structureTemplates.components.AddItemsToChestComponent component) {
    org.terasology.structureTemplates.util.transform.BlockRegionTransform transformation = event.getTransformation();
    org.terasology.world.block.items.BlockItemFactory blockFactory = new org.terasology.world.block.items.BlockItemFactory(entityManager);
    for (org.terasology.structureTemplates.components.AddItemsToChestComponent.ChestToFill chestToFill : component.chestsToFill) {
        org.terasology.math.geom.Vector3i absolutePosition = transformation.transformVector3i(chestToFill.position);
        org.terasology.entitySystem.entity.EntityRef chest = blockEntityRegistry.getBlockEntityAt(absolutePosition);
        chest.addComponent(new org.terasology.logic.inventory.InventoryComponent(30));
        for (org.terasology.structureTemplates.components.AddItemsToChestComponent.Item item : chestToFill.items) {
            addItemToChest(chest, item, blockFactory);
        }
    }
}
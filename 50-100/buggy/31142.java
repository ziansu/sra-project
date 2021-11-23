@org.terasology.logic.console.commandSystem.annotations.Command(shortDescription = "Building generation test")
public void build() {
    console.addMessage("Starting building a default structure ...");
    org.terasology.grammar.world.building.BuildingGenerator generator = setUp();
    org.terasology.grammar.world.block.BlockCollection collection = generator.generate(3, 12, 3);
    org.terasology.math.geom.Vector3f targetPos = cameraTargetSystem.getHitPosition();
    if ((worldProvider) != null) {
        worldProvider.getWorldEntity().send(new org.terasology.world.block.entity.placement.PlaceBlocks(collection.getBlocks()));
    }
    console.addMessage("Finished ...");
}
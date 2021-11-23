protected void update() throws java.io.IOException, org.newdawn.slick.SlickException {
    contextualCollisions.update();
    for (world.Sector sector : sectorMap.getActiveSectors()) {
        sector.update();
        for (interfaces.Collider collider : sector.popNewColliders()) {
            collider.assignPhysicalCollisions(physicalCollisions);
            collider.assignContextualCollisions(contextualCollisions);
        }
    }
}
public foundation.softwaredesign.orbi.model.World getWorld(foundation.softwaredesign.orbi.model.GeoPosition geoPosition) {
    foundation.softwaredesign.orbi.model.World world = new foundation.softwaredesign.orbi.model.World();
    java.util.List<foundation.softwaredesign.orbi.model.GameObject> gameObjectList = gameObjectService.getObjectAround(geoPosition);
    world.setGameObjects(gameObjectList);
    elevationService.addAltitude(world);
    return world;
}
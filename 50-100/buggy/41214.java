public boolean requestMovement(model.entity.Entity e, model.map.Direction dir) {
    model.map.pair.CoordinatePair desiredLocation;
    desiredLocation = model.map.GameMap.locationPlusDirection(e.getLocation(), dir);
    if (MV.canTraverse(e.getMotionType(), getItemAtCoordinate(desiredLocation), getTileAtCoordinate(desiredLocation).getMotionType())) {
        MC.moveEntity(e, desiredLocation, getAreaEffectAtCoordinate(desiredLocation), getItemAtCoordinate(desiredLocation), getSwitcherAtCoordinate(desiredLocation), getTrapAtCoordinate(desiredLocation));
        return true;
    }else {
        return false;
    }
}
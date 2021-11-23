public void workAt(com.mdeiml.ld38.Building building) {
    if (building == null) {
        workBuilding = null;
    }
    aim = (Building.BUILDINGS_OFFSET) + (((building.getSlot()) + 0.5F) * (Building.BUILDINGS_WIDTH));
    this.workBuilding = building;
}
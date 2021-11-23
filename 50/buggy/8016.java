public com.potatoes.cultivation.logic.GameMap.MapCoordinates go(com.potatoes.cultivation.logic.GameMap.MapDirections direction) {
    return new com.potatoes.cultivation.logic.GameMap.MapCoordinates(((this.i) + (direction.iShift)), ((this.j) + (direction.jShift)));
}
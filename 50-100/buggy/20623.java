public void setFloorTransitionType(int newType) {
    int oldType = this.floorTransitionType;
    this.floorTransitionType = newType;
    for (app.dataPrimitives.GraphNode node : getAdjacent()) {
        if ((node.getLocation().getFloor().equals(this.getLocation().getFloor())) && ((node.floorTransitionType) == oldType)) {
            node.setFloorTransitionType(newType);
        }
    }
}
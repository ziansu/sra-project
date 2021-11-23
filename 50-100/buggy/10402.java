public WPI.CampusMap.Backend.ConnectionPoint getConnectionPoint() {
    WPI.CampusMap.Backend.ConnectionPoint temp = new WPI.CampusMap.Backend.ConnectionPoint(this.getCoord(), this.getType(), this.getId(), this.getMap(), "", "");
    for (WPI.CampusMap.Backend.Point point : this.getNeighborsP()) {
        temp.addNeighbor(point);
    }
    return temp;
}
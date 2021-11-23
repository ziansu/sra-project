public Player.Area getInternalBorders() {
    Player.Area internalBorders = new Player.Area();
    for (Player.Zone zone : zones) {
        for (Player.Zone neighbor : zone.neighbors()) {
            if ((!(this.zones.contains(neighbor))) && (!(internalBorders.zones.contains(zone))))
                internalBorders.zones.add(zone);
            
        }
    }
    return internalBorders;
}
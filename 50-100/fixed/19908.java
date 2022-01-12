public void createContinents() {
    Player.Area worldCopy = new Player.Area();
    worldCopy.zones.addAll(this.area.zones);
    while ((worldCopy.zones.size()) > 0) {
        Player.Continent continent = new Player.Continent();
        continent.area = accessibleZones(worldCopy.zones.get(0));
        Player.world.continents.add(continent);
        worldCopy.removeArea(continent.area);
    } 
}
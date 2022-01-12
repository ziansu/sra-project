public void initialHarvest() {
    java.util.Iterator<player.Player> players = model.getPlayerIterator();
    while (players.hasNext()) {
        player.Player p = players.next();
        model.Construction.VertexBuilding firstBuilding = p.getBuilding(1);
        model.harvest(firstBuilding);
    } 
}
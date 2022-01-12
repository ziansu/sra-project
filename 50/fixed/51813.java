public boolean putObject(tk.ubublik.redivansion.gamelogic.units.objects.WorldObject worldObject) {
    if (worldMap.put(worldObject)) {
        mapRenderer.putObject(worldObject);
        return true;
    }else
        return false;
    
}
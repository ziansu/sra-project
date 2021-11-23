@java.lang.Override
public boolean collide(ca.cinnamon.hourglass.entity.Entity E) {
    if (E == (ca.cinnamon.hourglass.map.Map.player)) {
        ca.cinnamon.hourglass.map.Map.currentMap = new ca.cinnamon.hourglass.map.Map(Map.currentMap.width, Map.currentMap.height);
        Map.currentMap.testCave(2);
        Map.player.currentMap = ca.cinnamon.hourglass.map.Map.currentMap;
        if ((ca.cinnamon.hourglass.map.Map.player) != null) {
            Map.currentMap.entities.add(Map.player);
            Map.player.loc = Map.currentMap.GetRandomFloorTile();
        }
        java.lang.System.out.println("Stairs Down");
    }
    return isSolid;
}
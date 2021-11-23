public soen.game.dd.models.Map addComponentsToMap(soen.game.dd.models.Map map) {
    java.awt.Point point = new java.awt.Point(1, 1);
    map.setEntryPoint(point);
    point.setLocation(10, 10);
    map.setExitPoint(point);
    point.setLocation(1, 1);
    map.setCharacterPoint(point);
    point.setLocation(5, 5);
    map.setChestPoint(point);
    return map;
}
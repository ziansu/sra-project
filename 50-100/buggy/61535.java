public soen.game.dd.models.Map addComponentsToMap(soen.game.dd.models.Map map) {
    soen.game.dd.models.Map editMap = map;
    java.awt.Point point = new java.awt.Point(1, 1);
    editMap.setEntryPoint(point);
    point.setLocation(10, 10);
    editMap.setExitPoint(point);
    point.setLocation(1, 1);
    editMap.setCharacterPoint(point);
    point.setLocation(5, 5);
    editMap.setChestPoint(point);
    return editMap;
}
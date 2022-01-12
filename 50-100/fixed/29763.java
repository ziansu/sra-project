public boolean creatObject(java.lang.String name, java.lang.String modelPath, int coordinateSystemID, int x, int y, gameSystem.gameObjectSystem.IDType id) {
    if (end)
        return false;
    
    view.queueEvent(new gameSystem.gameObjectSystem.ObjectCreator(sdk, modelPath, coordinateSystemID, objects, OIR.getSoldierInfoByName(name), x, y, id));
    return false;
}
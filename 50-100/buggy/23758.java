public void moveLeft() {
    if (((character.getCharacterX()) == 0) && ((sceneX) > 0)) {
        sceneX -= 1;
        setScenery(map.get(sceneY).getScenery(sceneX));
        character.setCharacterPosition(new james.monochrome.data.PositionData(mapKey, sceneX, sceneY, 9, character.getCharacterY()));
    }else
        character.moveLeft();
    
    mapPositions.put(mapKey, character.getPosition());
}
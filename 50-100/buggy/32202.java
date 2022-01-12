public void moveUp() {
    if (((character.getCharacterY()) == 0) && ((sceneY) > 0)) {
        sceneY -= 1;
        setScenery(map.get(sceneY).getScenery(sceneX));
        character.setCharacterPosition(new james.monochrome.data.PositionData(mapKey, sceneX, sceneY, character.getCharacterX(), 9));
    }else
        character.moveUp();
    
    mapPositions.put(mapKey, character.getPosition());
}
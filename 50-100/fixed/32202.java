public void moveUp() {
    if (((character.getCharacterY()) == 0) && ((sceneY) > 0)) {
        sceneY -= 1;
        setScenery(map.get(sceneY).getScenery(sceneX));
        character.setCharacterPosition(character.getCharacterX(), 9);
    }else
        character.moveUp();
    
    mapPositions.put(mapKey, character.getPosition());
}
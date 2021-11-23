private void addCharacter(java.lang.String name) {
    gameState.updateClientPlayer();
    gameState.generateCharacters(name, manager);
}
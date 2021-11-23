private void addCharacter(java.lang.String name) {
    gameState.updateClientPlayer(gameState.getClientPlayer());
    gameState.generateCharacters(gameState.getClientPlayer(), name, manager);
}
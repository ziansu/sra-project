private void createCharacter() {
    com.color.game.stages.GameStage.character = new java.lang.Character(com.color.game.utils.WorldUtils.createCharacter(world, 3, 2));
    setKeyboardFocus(com.color.game.stages.GameStage.character);
}
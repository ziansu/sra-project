public boolean isInteractionWithHuman(float x, float y) {
    for (int i = 0; i < (gameView.getHumansList().size()); i++) {
        com.crap.game.view.CharacterView characterView = gameView.getHumansList().get(i);
        if (interactionModel.isInteraction(characterView.getCharacter(), x, y)) {
            setInteractingCharacter(characterView.getCharacter(), characterView);
            return true;
        }
    }
    return false;
}
private void playDices(float deltaTime) {
    Dices.instance.update(deltaTime);
    timerForThrowingDices += deltaTime;
    if (((timerForThrowingDices) >= 5) && (Dices.instance.canPlayerThrowDices)) {
        Dices.instance.throwDices(diceContainer.diceMarginFromX, diceContainer.diceMarginToX, diceContainer.diceMarginFromY, diceContainer.diceMarginToY);
        timerForThrowingDices -= 5.0F;
        Gdx.app.debug(com.smb215team.barjis.game.GameController.TAG, "The value of the dices: ");
    }
}
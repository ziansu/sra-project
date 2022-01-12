public void displayFlashMessage(java.lang.String message, com.badlogic.gdx.graphics.Color color, float time) {
    flashMessage.clearActions();
    flashMessage.setText(message);
    flashMessage.setColor(color);
    flashMessage.setPosition((((taxe.TaxeGame.WORLD_WIDTH) / 2) - ((flashMessage.getTextBounds().width) / 2)), ((taxe.TaxeGame.WORLD_HEIGHT) - 24));
    flashMessage.addAction(sequence(delay(time), fadeOut(0.25F)));
}
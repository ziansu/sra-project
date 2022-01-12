public boolean nextTurn() {
    currentSprite.playerSprite(canvas);
    if (getCurrentPlayer().hasMule()) {
        getCurrentPlayer().setMule(null);
    }
    currentSprite.reset();
    currentSprite.remove(canvas);
    currentSprite.remove(townCanvas);
    currentSprite.remove(storeCanvas);
    boolean atEnd = nextPlayer();
    updateSpriteLocation();
    outfitMode();
    outfitGUI();
    return atEnd;
}
protected void handleInput() {
    if (Gdx.input.justTouched()) {
        touchPoint.set(Gdx.input.getX(), Gdx.input.getY(), 0);
        c.unproject(touchPoint);
        if (((touchPoint.x) <= (com.metaminers.game.GameConstants.INTERFACE_PANEL_WIDTH)) || ((touchPoint.x) >= ((com.metaminers.game.GameConstants.WIDTH) - (com.metaminers.game.GameConstants.INTERFACE_PANEL_WIDTH))))
            handleMovementInventory(touchPoint.x, touchPoint.y);
        else
            handleMovementMap(touchPoint.x, touchPoint.y);
        
    }
}
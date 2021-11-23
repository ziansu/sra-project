public void center() {
    setPosition(((game.Game.getPlayer().getX()) - ((Game.SCREEN_WIDTH) / 2)), ((game.Game.getPlayer().getY()) - ((Game.SCREEN_HEIGHT) / 2)));
    update();
}
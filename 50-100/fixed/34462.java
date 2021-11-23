private void drawCoins(org.newdawn.slick.Graphics graphics) {
    graphics.setColor(Color.blue);
    synchronized(droppedCoins) {
        for (logic.Coin coin : droppedCoins) {
            gui.RND.drawColor(graphics, coinImageN, coinImageA, ((coin.getX()) - (gui.GameState.COIN_IMAGE_OFFSET)), ((coin.getY()) - (gui.GameState.COIN_IMAGE_OFFSET)), mainGame.getColor());
        }
    }
    graphics.setColor(Color.white);
}
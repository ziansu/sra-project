public int getPlayerTopY() {
    return (((br.com.giorgetti.games.squareplatform.main.GamePanel.HEIGHT) - (getPlayerY())) - (getHalfPlayerHeight())) + (map.getY());
}
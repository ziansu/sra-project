private void drawPlayer() {
    if ((player1) != null) {
        dbg.drawImage(player1.getImage(), ((int) (player1.getX())), ((int) (player1.getY())), this);
    }
}
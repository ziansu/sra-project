private void turn() {
    setFacing(util.Util.getAngle(((x) + (PLAYER_SIZE)), ((y) + (PLAYER_SIZE)), player.Cursor.getGridX(), player.Cursor.getGridY()));
}
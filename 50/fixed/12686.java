private void turn() {
    setFacing(util.Util.getAngle(x, y, player.Cursor.getGridX(), player.Cursor.getGridY()));
}
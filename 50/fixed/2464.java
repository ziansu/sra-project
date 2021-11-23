public boolean moveToRoom(int newX, int newY, se.eit.citypvp_package.CityPvpRoom to, int force) {
    this.moveToRoomThreadSafe(to);
    this.x = newX;
    this.y = newY;
    this.setUpdateCounter();
    return true;
}
public int getOwnerID(int x, int z, int y, java.lang.String world) {
    int res = this.sqlHandler.getColumnInt((((((((("SELECT player FROM blocks WHERE x=" + x) + " AND y=") + y) + " AND z=") + z) + " AND world='") + world) + "'"), "player");
    if (res != 0) {
        return res;
    }else {
        return 0;
    }
}
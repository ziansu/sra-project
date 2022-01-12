public int getSide(int xcoor, int ycoor) {
    if (ycoor >= 29) {
        ycoor = 0 + (ycoor % 29);
    }
    if (ycoor <= 0) {
        ycoor = 29 - (ycoor % 29);
    }
    if (xcoor >= 29) {
        xcoor = 0 + (xcoor % 29);
    }
    if (xcoor <= 0) {
        xcoor = 29 - (xcoor % 29);
    }
    return grid[xcoor][ycoor];
}
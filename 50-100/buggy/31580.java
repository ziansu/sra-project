public int getSide(int xcoor, int ycoor) {
    if (ycoor >= 29) {
        ycoor = 1 + (ycoor % 30);
    }
    if (ycoor <= 1) {
        ycoor = 29 - (ycoor % 30);
    }
    if (xcoor >= 29) {
        xcoor = 1 + (xcoor % 30);
    }
    if (xcoor <= 1) {
        xcoor = 29 - (xcoor % 30);
    }
    return grid[xcoor][ycoor];
}
public void checkTop(int[][] box, int x, int y) {
    if ((islandMap[x][(y - 1)]) == 1) {
        box[x][(y - 1)] = 0;
        checkoutIsland(box, x, (y - 1));
    }
    return ;
}
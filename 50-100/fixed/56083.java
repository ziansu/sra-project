public void checkRight(int[][] box, int x, int y) {
    if ((islandMap[(x + 1)][y]) == 1) {
        box[(x + 1)][y] = -1;
        checkoutIsland(box, (x + 1), y);
    }
    return ;
}
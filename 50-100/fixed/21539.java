public void build(int[] tiles) {
    try {
        if ((tiles[2]) == 0)
            findRoad(tiles).build(currentPlayer());
        else
            findJunction(tiles).build(currentPlayer());
        
    } catch (java.lang.Exception ex) {
        java.lang.System.out.println("can't build there!");
    }
}
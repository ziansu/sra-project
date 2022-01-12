public boolean getStatus(int x, int y) {
    boolean isWalkable = true;
    try {
        if ((map[x][y]) >= 20) {
            java.lang.System.out.println(("Map number: " + (map[x][y])));
            isWalkable = false;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("" + e));
    }
    return isWalkable;
}
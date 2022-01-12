public boolean getStatus(int x, int y) {
    boolean isWalkable = true;
    try {
        if ((map[y][x]) >= 20) {
            isWalkable = false;
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.println(("" + e));
    }
    return isWalkable;
}
public boolean addThing(Thing t, int x, int y) {
    if ((grid[x][y]) == null) {
        grid[x][y] = Thing;
        return true;
    }else {
        java.lang.System.out.println(grid[x][y]);
        return false;
    }
}
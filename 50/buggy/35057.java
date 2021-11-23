public void getVisited(int side) {
    java.lang.System.out.print((("To this cell: break " + side) + "\n"));
    visited = true;
    walls[side] = 0;
    update();
}
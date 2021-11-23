public void execute(org.openpixi.pixi.physics.grid.Grid grid, int[] coor) {
    org.openpixi.pixi.physics.grid.LinkMatrix V;
    for (int k = 0; k < (coor.length); k++) {
        V = grid.getE(coor, k).mult(at).getLinkExact();
        grid.setUnext(coor, k, grid.getU(coor, k).mult(V));
    }
}
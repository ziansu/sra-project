private void drawTopV() {
    int startpoint = 0;
    int endpoint = ((int) (java.lang.Math.ceil((((width) - 1) / 2))));
    for (int row = startpoint; row <= endpoint; row++) {
        drawOneRow(true, (endpoint - row), ((row * 2) - 1));
        java.lang.System.out.println();
    }
}
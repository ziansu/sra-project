private void drawTopV() {
    int startpoint = 0;
    int endpoint = ((int) (java.lang.Math.ceil((((width) - 1) / 2))));
    for (int row = startpoint; row <= endpoint; row++) {
        drawOneRow((endpoint - row), (row * 2));
        java.lang.System.out.println();
    }
}
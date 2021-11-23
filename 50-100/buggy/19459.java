private void init(int[][] rectangles) {
    initSquare(rectangles);
    region = new boolean[(rightTop[2]) - (leftBtm[0])][(rightTop[3]) - (leftBtm[1])];
}
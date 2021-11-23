private void init(int[][] rectangles) {
    initSquare(rectangles);
    region = new boolean[(rightTop[3]) - (leftBtm[1])][(rightTop[2]) - (leftBtm[0])];
}
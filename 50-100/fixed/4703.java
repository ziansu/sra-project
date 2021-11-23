private int cv(int y, int x) {
    if ((x == 0) || ((x + 1) >= (width)))
        return java.lang.Integer.MAX_VALUE;
    
    return java.lang.Math.abs(((grayArr[y][(x + 1)]) - (grayArr[y][(x - 1)])));
}
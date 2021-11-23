@java.lang.Override
protected boolean isSquareReachable(int toX, int toY) {
    if (!(super.isSquareReachable(toX, toY))) {
        return false;
    }
    return (((java.lang.Math.abs((toX - (x)))) == 1) || ((toX - (x)) == 0)) && (((java.lang.Math.abs((toY - (y)))) == 1) || ((toY - (y)) == 0));
}
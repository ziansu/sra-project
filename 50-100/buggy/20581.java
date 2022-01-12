private int incr(int len, int x, int deltaX, final int xprime) {
    if (deltaX > 0) {
        return (x + deltaX) < len ? x + deltaX : xprime;
    }else {
        return (x + deltaX) > 0 ? x + deltaX : xprime;
    }
}
public static java.lang.String swapInt(int x, int y) {
    if (x > y) {
        x = x - (x - y);
        y = y + (x - y);
    }else {
        x = x + (x - y);
        y = y - (x - y);
    }
    return (("x: " + x) + "\ny: ") + y;
}
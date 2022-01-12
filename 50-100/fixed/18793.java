public static java.lang.String swapInt(int x, int y) {
    if (x > y) {
        x = x - y;
        y = y + x;
        x = y - x;
    }else {
        x = x + y;
        y = y - x;
        x = y + x;
    }
    return (("x: " + x) + "\ny: ") + y;
}
public void reverse(int x, int y) {
    if (x > y) {
        int tmp = x;
        x = y;
        y = tmp;
    }
    start(new algvis.reversals.Reverse(this, x, y));
}
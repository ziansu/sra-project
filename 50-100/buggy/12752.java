private int calcHeigth() {
    int aY = a.getBlockY();
    int bY = b.getBlockY();
    int y = 0;
    if (aY > bY) {
        y = bY - aY;
    }else {
        y = aY - bY;
    }
    return y;
}
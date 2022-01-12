public int extractY(int y) {
    int py = y - ((guitarchordmaker.Look.YOFF) - 50);
    if (curAccord.sixakk) {
        py -= 60;
        py /= 50;
    }else {
        py -= 15 + ((guitarchordmaker.Look.YOFF) - 50);
        py /= 50;
    }
    return py;
}
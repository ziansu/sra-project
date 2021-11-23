public int extractY(int y) {
    int py = y;
    if (curAccord.sixakk) {
        py -= 60 + ((guitarchordmaker.Look.YOFF) - 50);
        py /= 50;
    }else {
        py -= 15 + ((guitarchordmaker.Look.YOFF) - 50);
        py /= 50;
    }
    return py;
}
private int getMinPos(double[] list) {
    int pos = 0;
    double minValue = list[0];
    for (int i = 0; i < (list.length); i++) {
        if ((list[i]) < minValue) {
            minValue = list[i];
            pos = i;
        }
    }
    return pos;
}
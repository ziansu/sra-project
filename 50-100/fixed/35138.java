public int getGap(int from) {
    if ((blocked) && (from == (-1))) {
        return 0;
    }
    for (int i = from + 1; i < (cars.length); i++) {
        if ((cars[i]) != null) {
            return (i - from) - 1;
        }
    }
    return ((cars.length) - from) - 1;
}
private int getCirculationIndex(int index, int length) {
    if (index < 0) {
        return index + length;
    }
    if (index > (length - 1)) {
        return index % length;
    }
    return index;
}
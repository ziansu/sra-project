private int closestIndex(int index) {
    return index <= ((size) / 2) ? index : ((size) - 1) - index;
}
public int indexOf(int x) {
    int index = binarySearch(x);
    return index >= 0 ? index : -1;
}
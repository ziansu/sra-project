public int indexOf(int element) {
    int index = binarySearch(element);
    return index >= 0 ? index : -1;
}
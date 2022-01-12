private boolean add(Point p, int i) {
    if ((size) < (arr.length)) {
        arr[size] = new PointIndexPair(p, i);
        sift(size);
        (size)++;
        return true;
    }
    return false;
}
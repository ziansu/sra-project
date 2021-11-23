public boolean add(Point p) {
    if ((size) < (arr.length)) {
        arr[size] = new PointIndexPair(p, size);
        sift(size);
        (size)++;
        return true;
    }
    return false;
}
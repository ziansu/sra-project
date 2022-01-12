private int IndexofPoint(Point[] pointsArr, Point point) {
    int size = pointsArr.length;
    for (int i = 0; i < size; i++) {
        if (pointsArr[i].equals(point))
            return i;
        
    }
    return -1;
}
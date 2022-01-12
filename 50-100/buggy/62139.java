private void checkNoDuplicatedPoints(Point[] points) {
    for (i = 0; (i) < (points.length); (i)++) {
        for (j = (i) + 1; (j) < (points.length); (j)++) {
            if ((points[i].compareTo(points[j])) == 0) {
                throw new java.lang.IllegalArgumentException("Duplicated points in input.");
            }
        }
    }
}
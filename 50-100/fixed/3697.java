private void checkrepeated(Point[] points) {
    Point[] axl = java.util.Arrays.copyOf(points, points.length);
    java.util.Arrays.sort(axl);
    for (int i = 0; i < ((axl.length) - 1); i++) {
        if ((axl[i].compareTo(axl[(i + 1)])) == 0)
            throw new java.lang.IllegalArgumentException();
        
    }
}
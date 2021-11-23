public void checkrepeated(Point[] points) {
    for (int i = 0; i < ((points.length) - 2); i++) {
        for (int j = i + 1; j < ((points.length) - 1); j++) {
            if ((points[i].compareTo(points[j])) == 0)
                throw new java.lang.IllegalArgumentException();
            
        }
    }
}
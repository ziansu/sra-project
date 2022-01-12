public LineSegment[] segments() {
    LineSegment[] cp = new LineSegment[size];
    for (int i = 0; i < (size); i++) {
        cp[i] = segments[i];
    }
    return cp;
}
public LineSegment[] segments() {
    LineSegment[] cp = new LineSegment[(segments.length) * 2];
    for (int m = 0; m < (segments.length); m++) {
        cp[m] = segments[m];
    }
    return cp;
}
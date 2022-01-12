private void resize(int length) {
    LineSegment[] newArr = new LineSegment[length];
    for (int i = 0; i < (segments.length); i++) {
        newArr[i] = segments[i];
    }
    segments = newArr;
    newArr = null;
}
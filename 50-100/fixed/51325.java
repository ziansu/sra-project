@java.lang.Override
public int compare(org.locationtech.geogig.model.internal.Quadrant[] left, org.locationtech.geogig.model.internal.Quadrant[] right) {
    final int minDepth = java.lang.Math.min(left.length, right.length);
    int c;
    for (int d = 0; d < minDepth; d++) {
        c = left[d].compareTo(right[d]);
        if (c != 0) {
            return c;
        }
    }
    c = (left.length) - (right.length);
    return c;
}
double heuristics(dstarlite.State a, dstarlite.State b) {
    double temp;
    double min = java.lang.Math.abs(((a.getX()) - (b.getX())));
    double max = java.lang.Math.abs(((a.getY()) - (b.getY())));
    if (min > max) {
        temp = min;
        min = max;
        max = temp;
    }
    return (((m_sqrt2) - 1.0) * min) + max;
}
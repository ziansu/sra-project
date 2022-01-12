private void trimHorizVert(int horizLimit, int vertLimit) {
    int i = 0;
    classifier.CrossSectionPoint p;
    while (i < (_points.size())) {
        p = _points.get(i);
        if (!(isWithinLimits(p, horizLimit, vertLimit))) {
            _points.remove(p);
        }else {
            i++;
        }
    } 
}
public geom.Point setPosition(int idx, geom.Point pt) {
    if ((idx >= 0) && (idx < 1000)) {
        geom.Point prevPt = LPosReg.get(idx);
        if (pt != null) {
            LPosReg.put(idx, pt);
        }
        if (idx == (nextPosition)) {
            updateNextPosition();
        }
        return prevPt;
    }
    return null;
}
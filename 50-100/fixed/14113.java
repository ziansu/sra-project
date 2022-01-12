public void addPoint(int pointIndex, org.geppetto.model.swc.format.SWCPoint swcPoint) throws org.geppetto.model.swc.format.SWCException {
    if ((size()) != (pointIndex - 1)) {
        throw new org.geppetto.model.swc.format.SWCException((((("A point skipped an index. Expected " + (size())) + 1) + " found ") + pointIndex));
    }
    points.put(pointIndex, swcPoint);
}
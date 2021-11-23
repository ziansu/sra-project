public geogebra.common.kernel.Matrix.Coords getStartInhomCoords() {
    if (((startPoint) != null) && (startPoint.isFinite())) {
        return startPoint.getInhomCoordsInD(3);
    }
    return getStartCoordsInD(3);
}
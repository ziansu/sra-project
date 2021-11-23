public geogebra.common.kernel.Matrix.Coords getStartInhomCoords() {
    if (((startPoint) != null) && (startPoint.isFinite()))
        return startPoint.getInhomCoordsInD(3);
    else
        return getStartCoordsInD(3);
    
}
public geogebra.common.kernel.Matrix.Coords getEndInhomCoords() {
    if ((getEndPoint()) != null) {
        return getEndPoint().getInhomCoordsInD(3);
    }
    return getPointInD(3, 1);
}
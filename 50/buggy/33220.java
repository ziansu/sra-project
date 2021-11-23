public geogebra.common.kernel.Matrix.Coords getEndInhomCoords() {
    if ((getEndPoint()) != null)
        return getEndPoint().getInhomCoordsInD(3);
    else
        return getPointInD(3, 1);
    
}
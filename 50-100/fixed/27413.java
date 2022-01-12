public geogebra.common.kernel.Matrix.Coords getCartesianEquationVector(geogebra.common.kernel.Matrix.CoordMatrix m) {
    if (m == null) {
        return new geogebra.common.kernel.Matrix.Coords(x, y, z);
    }
    geogebra.common.kernel.Matrix.Coords o = getStartInhomCoords();
    geogebra.common.kernel.Matrix.Coords d = getEndInhomCoords().sub(o);
    return geogebra.common.kernel.Matrix.CoordMatrixUtil.lineEquationVector(o, d, m);
}
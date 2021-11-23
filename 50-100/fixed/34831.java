protected org.geogebra.common.kernel.Matrix.Coords[] getProjection(org.geogebra.common.kernel.Matrix.Coords willingCoords, org.geogebra.common.kernel.Matrix.Coords willingDirection, double t1, double t2) {
    if ((tmpCoords6) == null) {
        tmpCoords6 = org.geogebra.common.kernel.Matrix.Coords.createInhomCoorsInD3();
    }
    tmpCoords6.setMul3(willingDirection, t1);
    tmpCoords6.setAdd3(tmpCoords6, willingCoords);
    tmpCoords6.setW(1);
    return getNormalProjection(tmpCoords6);
}
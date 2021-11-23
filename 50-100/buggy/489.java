public gov.nasa.worldwind.geom.Vec4 transformModelToBoxCenter(gov.nasa.worldwind.geom.Vec4 modelPoint) {
    gov.nasa.worldwind.geom.Vec4[] unitAxes = new gov.nasa.worldwind.geom.Vec4[]{ ru , su , tu };
    gov.nasa.worldwind.geom.Vec4 origin = this.getCenter();
    gov.nasa.worldwind.geom.Matrix transformMatrix = gov.nasa.worldwind.geom.Matrix.fromLocalOrientation(origin, unitAxes).getInverse();
    return modelPoint.transformBy4(transformMatrix);
}
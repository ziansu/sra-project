public void setAzimuth(double azimuth) {
    if ((this.azimuth) == azimuth) {
        return ;
    }
    this.azimuth = azimuth;
    if ((shape) != null) {
        rotMat = new com.ardor3d.math.Matrix3();
        shape.setRotation(rotMat.fromAngles(java.lang.Math.toRadians(tilt), 0.0, (-(java.lang.Math.toRadians(azimuth)))));
    }
}
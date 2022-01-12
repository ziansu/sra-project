public de.tschebbischeff.math.Quat4d pitch(double pitch) {
    return this.mult(new de.tschebbischeff.math.Quat4d(java.lang.Math.cos(((java.lang.Math.toRadians(pitch)) * 0.5)), 0.0, java.lang.Math.sin(((java.lang.Math.toRadians(pitch)) * 0.5)), 0.0)).checkUnity();
}
public de.tschebbischeff.math.Quat4d roll(double roll) {
    return new de.tschebbischeff.math.Quat4d(java.lang.Math.cos(((java.lang.Math.toRadians(roll)) * 0.5)), java.lang.Math.sin(((java.lang.Math.toRadians(roll)) * 0.5)), 0.0, 0.0).mult(this).checkUnity();
}
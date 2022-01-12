public pe.util.math.Mat3f rotate(float theta) {
    pe.util.math.Mat3f rotation = new pe.util.math.Mat3f();
    double rotRadian = java.lang.Math.toRadians(theta);
    float cos = ((float) (java.lang.Math.cos(rotRadian)));
    float sin = ((float) (java.lang.Math.sin(rotRadian)));
    rotation.s00 = cos;
    rotation.s01 = sin;
    rotation.s10 = -sin;
    rotation.s11 = cos;
    return pe.util.math.Mat3f.mul(rotation, this);
}
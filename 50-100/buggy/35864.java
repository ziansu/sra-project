public org.joml.Quaternion invert() {
    float norm = ((((x) * (x)) + ((y) * (y))) + ((z) * (z))) + ((w) * (w));
    x = (x) / norm;
    y = (-(y)) / norm;
    z = (-(z)) / norm;
    w = (-(w)) / norm;
    return this;
}
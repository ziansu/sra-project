public static far.math.vec.Vec3f normalize(far.math.vec.Vec3f vec) {
    float temp;
    temp = ((java.lang.Math.abs(vec.x)) + (java.lang.Math.abs(vec.y))) + (java.lang.Math.abs(vec.z));
    vec = far.math.vec.Vec3f.div(vec, temp);
    return vec;
}
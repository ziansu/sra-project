public static boolean rayIntersectsSphere(com.pi.math.vector.Vector O, com.pi.math.vector.Vector D, com.pi.math.vector.Vector center, float radius) {
    com.pi.math.vector.Vector oMC = O.clone().subtract(center);
    float b = D.dot(oMC);
    float c = (D.mag2()) * ((oMC.mag2()) - (radius * radius));
    return (java.lang.Math.abs(((b * b) - c))) < (com.pi.math.MathUtil.EPSILON);
}
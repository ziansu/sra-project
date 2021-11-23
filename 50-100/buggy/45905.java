net.ogiekako.algorithm.geometry.Point rot(double x) {
    return new net.ogiekako.algorithm.geometry.Point(((x * (java.lang.Math.cos(x))) - ((y) * (java.lang.Math.sin(x)))), (((y) * (java.lang.Math.cos(x))) + (x * (java.lang.Math.sin(x)))));
}
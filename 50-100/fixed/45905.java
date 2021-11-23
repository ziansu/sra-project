net.ogiekako.algorithm.geometry.Point rot(double t) {
    return new net.ogiekako.algorithm.geometry.Point((((x) * (java.lang.Math.cos(t))) - ((y) * (java.lang.Math.sin(t)))), (((y) * (java.lang.Math.cos(t))) + ((x) * (java.lang.Math.sin(t)))));
}
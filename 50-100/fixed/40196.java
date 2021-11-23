public double makeLiteracy(java.lang.String g, double w) {
    double d = ((w / 16768100) * 100) / 2;
    return d + (d * ((int) (((java.lang.Math.random()) * 1) + 1)));
}
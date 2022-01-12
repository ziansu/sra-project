public double makeLiteracy(java.lang.String g, double w) {
    int f = findGovNum(g);
    double d = ((w / 16768100) * 100) / 2;
    return d + ((d * (f / 10)) * 15);
}
protected double distance(lineType.GPoint3 p) {
    lineType.GVector3 v1;
    lineType.GVector3 v2;
    v1 = new lineType.GVector3(p, p1);
    v2 = new lineType.GVector3(p, p2);
    return (v1.product(v2).length()) / (p1.distance(p2));
}
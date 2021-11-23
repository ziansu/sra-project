private void initProps() {
    validate();
    ca.nrc.cadc.caom2.types.MultiPolygon.PolygonProperties pp = computePolygonProperties();
    this.area = pp.area;
    this.center = pp.center;
    this.minimumSpanningCircle = pp.minSpanCircle;
    this.ccw = pp.windCounterClockwise;
}
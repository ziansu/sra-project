public java.util.List<org.nschmidt.csg.Polygon> allPolygons() {
    java.util.List<org.nschmidt.csg.Polygon> localPolygons = new java.util.ArrayList<org.nschmidt.csg.Polygon>(this.polygons);
    if ((this.front) != null) {
        localPolygons.addAll(this.front.allPolygons());
    }
    if ((this.back) != null) {
        localPolygons.addAll(this.back.allPolygons());
    }
    return localPolygons;
}
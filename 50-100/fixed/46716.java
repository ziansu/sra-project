public java.util.List<org.nschmidt.csg.Polygon> allPolygons(java.util.List<org.nschmidt.csg.Polygon> result) {
    result.addAll(this.polygons);
    if ((this.front) != null) {
        this.front.allPolygons(result);
    }
    if ((this.back) != null) {
        this.back.allPolygons(result);
    }
    return result;
}
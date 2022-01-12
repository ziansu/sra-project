public java.lang.String toWKT() {
    java.lang.String wkt = ((("Point(" + (this.getLng())) + " ") + (this.getLat())) + ")";
    return wkt;
}
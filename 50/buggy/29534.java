public java.lang.String toWKT() {
    java.lang.String wkt = ((("Point(" + (this.getLat())) + " ") + (this.getLng())) + ")";
    return wkt;
}
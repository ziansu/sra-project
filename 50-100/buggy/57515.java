org.Point toRealPoint() {
    java.util.ArrayList<java.lang.String> names = new java.util.ArrayList<java.lang.String>(java.util.Arrays.asList(this.name.split(";")));
    org.Point ret = new org.Point(this.xCoord, this.yCoord, names, this.id, new java.util.ArrayList<org.Point>(), this.floor);
    return ret;
}
@java.lang.Override
protected void produceWKTGeometry() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("POINT(");
    sb.append(this.getLongitude());
    sb.append(" ");
    sb.append(this.getLatitude());
    sb.append(")");
    this.wktString = sb.toString();
    this.wktStringProduced = true;
}
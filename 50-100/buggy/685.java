@java.lang.Override
public boolean equals(java.lang.Object object) {
    java.lang.System.out.println("in i equals");
    if (object instanceof PolygonWithBoats) {
        java.lang.System.out.println("längre in");
        PolygonWithBoats polygon = ((PolygonWithBoats) (object));
        boolean x = (this.hashCode()) == (polygon.hashCode());
        java.lang.System.out.println(("x = " + x));
        return x;
    }
    return false;
}
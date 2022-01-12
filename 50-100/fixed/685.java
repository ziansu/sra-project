@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (object instanceof PolygonWithBoats) {
        PolygonWithBoats polygon = ((PolygonWithBoats) (object));
        boolean x = (this.hashCode()) == (polygon.hashCode());
        return x;
    }
    return false;
}
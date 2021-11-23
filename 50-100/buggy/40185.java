@java.lang.Override
protected org.iMage.geometrify.Triangle generatePrimitive() {
    java.awt.Point a = this.pointGenerator.nextPoint();
    java.util.Objects.requireNonNull(a);
    java.awt.Point b = this.pointGenerator.nextPoint();
    java.util.Objects.requireNonNull(b);
    java.awt.Point c = this.pointGenerator.nextPoint();
    java.util.Objects.requireNonNull(c);
    org.iMage.geometrify.Triangle t = new org.iMage.geometrify.Triangle(a, b, c);
    java.util.Objects.requireNonNull(t);
    return t;
}
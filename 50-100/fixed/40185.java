@java.lang.Override
protected org.iMage.geometrify.Triangle generatePrimitive() {
    java.awt.Point a = this.pointGenerator.nextPoint();
    java.awt.Point b = this.pointGenerator.nextPoint();
    java.awt.Point c = this.pointGenerator.nextPoint();
    org.iMage.geometrify.Triangle t = new org.iMage.geometrify.Triangle(a, b, c);
    return t;
}
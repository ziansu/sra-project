public java.awt.Point getTipPos() {
    return new java.awt.Point(((int) ((pos.x) + (16 * (java.lang.Math.cos(ang))))), ((int) ((pos.y) + (16 * (java.lang.Math.sin(ang))))));
}
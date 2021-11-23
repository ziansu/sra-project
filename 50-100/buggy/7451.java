@java.lang.Override
public com.buginc.java.math.geometry.Vector cnt() {
    com.buginc.java.math.geometry.Vector center = new com.buginc.java.math.geometry.Vector(0, 0);
    int i = outline.size();
    for (com.buginc.java.math.geometry.Vector vector : outline) {
        center = center.add(vector.inc(i));
        --i;
    }
    return center.dec(outline.size());
}
@java.lang.Override
public java.util.Vector cnt() {
    java.util.Vector center = new java.util.Vector(0, 0);
    int i = outline.size();
    for (java.util.Vector vector : outline) {
        center = center.add(vector.inc(i));
        --i;
    }
    return center.dec(outline.size());
}
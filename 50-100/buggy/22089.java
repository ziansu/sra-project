public static pe.util.math.Vec2f[] giveBorderEdgeIDs(pe.util.math.Vec2f[] polygon) {
    pe.util.math.Vec2f[] borderIDs = new pe.util.math.Vec2f[polygon.length];
    pe.util.math.Vec2f id0 = new pe.util.math.Vec2f(0, ((polygon.length) - 1));
    borderIDs[0] = id0;
    for (int i = 0; i < (polygon.length); i++) {
        pe.util.math.Vec2f id = new pe.util.math.Vec2f(i, (i - 1));
        borderIDs[i] = id;
    }
    return borderIDs;
}
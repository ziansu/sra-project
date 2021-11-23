@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o instanceof util.Vec2) {
        util.Vec2 v = ((util.Vec2) (o));
        return ((java.lang.Math.abs(((x) - (v.x)))) <= (util.Vec2.tol)) && ((java.lang.Math.abs(((y) - (v.y)))) <= (util.Vec2.tol));
    }
    return false;
}
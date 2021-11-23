@java.lang.Override
public boolean equals(java.lang.Object o) {
    if (o instanceof util.Vec2) {
        util.Vec2 v = ((util.Vec2) (o));
        return (((x) - (v.x)) <= (util.Vec2.tol)) && (((y) - (v.y)) <= (util.Vec2.tol));
    }
    return false;
}
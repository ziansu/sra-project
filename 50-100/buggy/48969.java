public org.jbox2d.common.Vec2 __Interpolate(org.jbox2d.common.Vec2 a, org.jbox2d.common.Vec2 b, float t) {
    return new org.jbox2d.common.Vec2((((b.x) - (a.x)) * t), (((b.y) - (a.y)) * t));
}
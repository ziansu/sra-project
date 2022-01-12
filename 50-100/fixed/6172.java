public io.anuke.aabb.Manifold set(io.anuke.aabb.Collider a, io.anuke.aabb.Collider b) {
    this.a = a;
    this.b = b;
    e = java.lang.Math.min(a.restitution, b.restitution);
    sf = 0;
    df = 0;
    normal.set(0, 0);
    penetration = 0;
    return this;
}
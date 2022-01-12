public io.anuke.aabb.Manifold set(io.anuke.aabb.Collider a, io.anuke.aabb.Collider b) {
    this.a = a;
    this.b = b;
    this.e = java.lang.Math.min(a.restitution, b.restitution);
    this.sf = 0;
    this.df = 0;
    this.normal.set(0, 0);
    this.penetration = 0;
    return this;
}
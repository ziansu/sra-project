private de.beuth.cg1.dogeraytracer.vecmatlib.Normal3 calcIntersectionNormal(de.beuth.cg1.dogeraytracer.vecmatlib.Ray r, double t) {
    de.beuth.cg1.dogeraytracer.vecmatlib.Point3 at = r.at(t);
    return new de.beuth.cg1.dogeraytracer.vecmatlib.Normal3(((at.x) - (center.x)), ((at.y) - (center.y)), ((at.z) - (center.z)));
}
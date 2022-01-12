public org.nschmidt.csg.VectorCSGd cross(org.nschmidt.csg.VectorCSGd a) {
    return new org.nschmidt.csg.VectorCSGd((((y) * (a.z)) - ((z) * (a.y))), (((z) * (a.x)) - ((x) * (a.z))), (((x) * (a.y)) - ((y) * (a.x))));
}
public org.nschmidt.csg.VectorCSGd cross(org.nschmidt.csg.VectorCSGd a) {
    return new org.nschmidt.csg.VectorCSGd((((this.y) * (a.z)) - ((this.z) * (a.y))), (((this.z) * (a.x)) - ((this.x) * (a.z))), (((this.x) * (a.y)) - ((this.y) * (a.x))));
}
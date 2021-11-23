public Vector getNormal() {
    Vector N = hitSurface.getNormalVector(hitPoint);
    N = N.scale((-1));
    return N;
}
public final nben.geometry.R2.Triangle triangleContainer(nben.geometry.R2.Point p) {
    int tri = triangleContainerID(p);
    return tri == (-1) ? null : triangle(tri);
}
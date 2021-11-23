public final nben.geometry.R2.Triangle triangleContainer(nben.geometry.R2.Point p) {
    int id = triangleContainerID(p);
    if (id == (-1))
        return null;
    else
        return triangle(id);
    
}
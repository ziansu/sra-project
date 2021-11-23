protected com.spatial4j.core.shape.Point randomPointIn(com.spatial4j.core.shape.Shape shape) {
    if (!(shape.hasArea()))
        throw new java.lang.UnsupportedOperationException("Need area to define shape!");
    
    com.spatial4j.core.shape.Rectangle bbox = shape.getBoundingBox();
    com.spatial4j.core.shape.Point p;
    do {
        p = randomPointIn(bbox);
    } while (!(shape.relate(p).intersects()) );
    return p;
}
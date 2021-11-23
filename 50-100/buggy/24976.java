public geometry.Circle2D getTransformed(geometry.Transform2D transform) {
    if ((transform.scale.x) != (transform.scale.y))
        throw new java.lang.IllegalArgumentException((("Can't scale a " + (this.getClass().getSimpleName())) + " with different x and y factors."));
    
    geometry.Transform2D partial = new geometry.Transform2D(transform.translation, transform.angle, transform.pivot);
    return new geometry.Circle2D(center.getTransformed(partial), ((radius) * (transform.scale.x)));
}
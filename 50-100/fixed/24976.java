public geometry.Circle2D getTransformed(geometry.Transform2D transform) {
    if ((transform.scale.x) != (transform.scale.y))
        throw new java.lang.IllegalArgumentException((("Can't scale a " + (this.getClass().getSimpleName())) + " with different x and y factors."));
    
    return new geometry.Circle2D(center.getTransformed(transform), ((radius) * (transform.scale.x)));
}
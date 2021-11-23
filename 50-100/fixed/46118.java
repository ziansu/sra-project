void render() {
    angle = gameObject.PVector.angleBetween(aim, defaultPlane);
    if ((aim.y) < 0)
        angle = -(angle);
    
    pushMatrix();
    translate(headPoint.x, headPoint.y);
    rotate(angle);
    popMatrix();
}
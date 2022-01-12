public int handleHorizontalCollisionResponse(entities.Entity obj) {
    int result = 0;
    if (isColliding(obj)) {
        boolean left = (x) <= (obj.x);
        if (left) {
            result = -1;
            x = (obj.x) - (width);
        }else {
            result = 1;
            x = (obj.x) + (obj.width);
        }
    }
    return result;
}
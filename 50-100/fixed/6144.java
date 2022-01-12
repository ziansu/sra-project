public int handleVerticalCollisionResponse(entities.Entity obj) {
    int result = 0;
    if (isColliding(obj)) {
        boolean above = (y) >= (obj.y);
        if (above) {
            result = 1;
            y = (obj.y) + (obj.height);
        }else {
            result = -1;
            y = (obj.y) - (height);
        }
    }
    return result;
}
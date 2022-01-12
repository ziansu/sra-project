private boolean intersectsPoint(com.critters.breakout.math.Vector2f v) {
    if (((((v.x) > (v1.x)) && ((v.x) < (v2.x))) && ((v.y) > (v1.y))) && ((v.y) < (v2.y)))
        return true;
    
    return false;
}
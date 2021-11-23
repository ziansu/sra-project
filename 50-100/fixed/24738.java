public it.unibs.pajc.agar.universe.IntersectionType intersects(it.unibs.pajc.agar.universe.CircleObject otherObject) {
    if ((getPosition().distance(otherObject.getPosition())) < (getRadius())) {
        if ((this.getMass()) > (otherObject.getMass()))
            return IntersectionType.THIS_EATS;
        else
            return IntersectionType.OTHER_EATS;
        
    }
    return IntersectionType.NO_INTERSECTION;
}
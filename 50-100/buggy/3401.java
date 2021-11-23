private boolean inArea(Actor a1, Actor a2) {
    double dist = java.lang.Math.sqrt(((java.lang.Math.pow(((a1.getX()) + (a2.getX())), 2)) + (java.lang.Math.pow(((a1.getY()) + (a2.getY())), 2))));
    if (dist <= (bubble)) {
        return true;
    }
    return false;
}
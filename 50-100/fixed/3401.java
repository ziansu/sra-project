private boolean inArea(Actor a1, Actor a2) {
    if (((java.lang.Math.abs(((a1.getX()) - (a2.getX())))) <= (bubble)) && ((java.lang.Math.abs(((a1.getY()) - (a2.getY())))) <= (bubble))) {
        return true;
    }
    return false;
}
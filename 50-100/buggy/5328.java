private boolean distance(quenchTheThirst.Entity e, int i) {
    if ((java.lang.Math.sqrt(((java.lang.Math.pow(((this.getX()) - (e.getX())), 2)) + (java.lang.Math.pow(((this.getY()) - (e.getY())), 2))))) < i) {
        return true;
    }
    return false;
}
public boolean moveHoriz() {
    if (!(movingHoriz())) {
        return false;
    }
    setCenterX(((centerX) + (((moveInc) / 3) * (java.lang.Math.signum(((destX) - (centerX)))))));
    return true;
}
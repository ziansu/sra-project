public boolean moveVert() {
    if (!(movingVert())) {
        return false;
    }
    setCenterY(((centerY) + ((moveInc) * (java.lang.Math.signum(((destY) - (centerY)))))));
    return true;
}
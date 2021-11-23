public boolean moveVert() {
    if (!(movingVert())) {
        return false;
    }
    java.lang.System.out.println("hey dogg");
    setCenterY(((centerY) + ((moveInc) * (java.lang.Math.signum(((destY) - (centerY)))))));
    return true;
}
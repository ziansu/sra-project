public boolean moveHoriz() {
    if (!(movingHoriz())) {
        return false;
    }
    java.lang.System.out.println("hey man");
    setCenterX(((centerX) + (((moveInc) / 3) * (java.lang.Math.signum(((destX) - (centerX)))))));
    return true;
}
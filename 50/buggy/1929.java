private void setCylinderCount(int value) {
    if ((value < 1) || (value > 12)) {
        throw new java.lang.IllegalArgumentException("Illegal cylinder count");
    }
    cylinderCount = value;
}
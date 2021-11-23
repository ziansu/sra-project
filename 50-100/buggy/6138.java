private void setCoords() {
    java.security.SecureRandom rdmgen = new java.security.SecureRandom();
    int random = (rdmgen.nextInt(11)) + 1;
    leftX = (HomeList.maxWidth) / random;
    topY = (HomeList.maxHeight) / random;
    rightX = (leftX) + (2 * (radius));
    bottomY = (topY) + (2 * (radius));
    findCentre();
}
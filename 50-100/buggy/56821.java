public boolean containsPoint(int xPos, int zPos) {
    return (((xPos > (x)) && (xPos < ((x) + 16))) && (zPos > (z))) && (zPos < ((z) + 16));
}
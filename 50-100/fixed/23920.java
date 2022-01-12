private void setEdgeAltitudes() {
    for (int x = 0; x <= (myWidth); x++) {
        myAltitude[x][myDepth] = baseHeight;
    }
    for (int z = 0; z <= (myDepth); z++) {
        myAltitude[myWidth][z] = baseHeight;
    }
}
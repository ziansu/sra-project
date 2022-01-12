public java.awt.Color GetColor() {
    if (hasDroid)
        return Constants.droidColor;
    
    if (hasFire)
        return Constants.fireColor;
    
    if (hasWall)
        return Constants.wallColor;
    
    if ((intensity) > 0) {
        int brightness = 255 - ((255 * (intensity)) / (Constants.fireRadius));
        return new java.awt.Color(255, 255, brightness);
    }
    return Constants.floorColor;
}
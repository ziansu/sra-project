public boolean staticFrost(int blurRadius) {
    if (!(canFrost()))
        return false;
    
    if ((isFrosted()) && (isLive())) {
        frostImmediate(blurRadius, false);
        return true;
    }
    frostScreen(blurRadius, false);
    return true;
}
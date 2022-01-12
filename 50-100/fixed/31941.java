public boolean liveFrost(int blurRadius) {
    if (!(canFrost()))
        return false;
    
    if ((isFrosted()) && (!(isLive()))) {
        frostImmediate(blurRadius, true);
        return true;
    }
    frostScreen(blurRadius, true);
    return true;
}
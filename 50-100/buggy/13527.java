public void staticFrost(int blurRadius) {
    if (!(canFrost()))
        return ;
    
    if ((isFrosted()) && (isLive())) {
        frostImmediate(blurRadius, false);
        return ;
    }
    frostScreen(blurRadius, false);
}
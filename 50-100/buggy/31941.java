public void liveFrost(int blurRadius) {
    if (!(canFrost()))
        return ;
    
    if ((isFrosted()) && (!(isLive()))) {
        frostImmediate(blurRadius, true);
        return ;
    }
    frostScreen(blurRadius, true);
}
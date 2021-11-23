public void setPrimaryProgress(float primaryProgress) {
    if (primaryProgress < 0) {
        primaryProgress = 0;
    }else
        if (primaryProgress > 1) {
            primaryProgress = 1;
        }
    
    this.primaryProgress = primaryProgress;
    invalidate();
}
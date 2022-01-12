private void applyNewHeight(final double orgHeight, final double newHeight, final boolean finalize) {
    if ((newHeight == 0) || (newHeight == orgHeight))
        return ;
    
    final double scale = newHeight / orgHeight;
    applyNewHeight(children, scale, finalize);
    if (finalize)
        boundingHeight = newHeight;
    
}
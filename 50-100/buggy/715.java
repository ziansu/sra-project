static int tryGetHeight(android.view.View child, int heightBound, boolean getMeasuredIfAny) {
    int height = -1;
    if ((height == (-1)) && getMeasuredIfAny)
        height = com.otaliastudios.printer.Utils.getMeasuredHeight(child);
    
    if (height == (-1))
        height = com.otaliastudios.printer.Utils.getEstimatedHeight(child, heightBound);
    
    return height;
}
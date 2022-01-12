public void onHighlightNext() {
    (highlightPosition)++;
    if ((highlightPosition) >= ((memoryData.getNumCells()) - 1)) {
        highlightPosition = (memoryData.getNumCells()) - 1;
        memorization.Bus.getBus().onDisableNext();
    }else
        if (memoryData.isRowMarker(highlightPosition)) {
            (highlightPosition)++;
        }else
            if ((highlightPosition) == 2) {
                memorization.Bus.getBus().onEnablePrev();
            }
        
    
    notifyDataSetChanged();
}
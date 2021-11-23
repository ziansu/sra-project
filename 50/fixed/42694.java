public void unselectCurrentSelectedPixel() {
    if ((currentPixelSelection) == null)
        return ;
    
    undoPixelSelection(currentPixelSelection);
    currentPixelSelection = null;
    imageListener.onPixelUnselected();
}
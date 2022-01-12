public void recycleAllBitmap() {
    if ((com.tetley.backgroundremover.BitmapUtil.subject) != null)
        com.tetley.backgroundremover.BitmapUtil.subject.recycle();
    
    if ((com.tetley.backgroundremover.BitmapUtil.raw) != null)
        com.tetley.backgroundremover.BitmapUtil.raw.recycle();
    
    if ((com.tetley.backgroundremover.BitmapUtil.smallerTransparentImage) != null)
        com.tetley.backgroundremover.BitmapUtil.smallerTransparentImage.recycle();
    
    if ((com.tetley.backgroundremover.BitmapUtil.fullSizetransparnetImage) != null)
        com.tetley.backgroundremover.BitmapUtil.fullSizetransparnetImage.recycle();
    
    if ((com.tetley.backgroundremover.BitmapUtil.finalImage) != null)
        com.tetley.backgroundremover.BitmapUtil.finalImage.recycle();
    
}
public void setShowOriginal(boolean b) {
    if (b) {
        if ((state) == (pixelitor.layers.ImageLayer.State.SHOW_ORIGINAL)) {
            return ;
        }
        setState(pixelitor.layers.ImageLayer.State.SHOW_ORIGINAL);
    }else {
        if ((state) == (pixelitor.layers.ImageLayer.State.PREVIEW)) {
            return ;
        }
        setState(pixelitor.layers.ImageLayer.State.PREVIEW);
    }
    comp.imageChanged(pixelitor.Composition.ImageChangeActions.REPAINT);
}
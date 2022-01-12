public void setShowOriginal(boolean b) {
    if (b) {
        assert (state) == (pixelitor.layers.ImageLayer.State.PREVIEW);
        setState(pixelitor.layers.ImageLayer.State.SHOW_ORIGINAL);
    }else {
        assert (state) == (pixelitor.layers.ImageLayer.State.SHOW_ORIGINAL);
        setState(pixelitor.layers.ImageLayer.State.PREVIEW);
    }
    comp.imageChanged(pixelitor.Composition.ImageChangeActions.REPAINT);
}
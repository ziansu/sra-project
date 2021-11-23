public void generate() {
    surface = com.ail.crxmarkets.model.Surface.random(surfaceLengthSlider, surfaceMinHeightSlider, surfaceMaxHeightSlider);
    textArea = com.ail.crxmarkets.Utils.printAsText(surface.getSurface());
    updateBarModel(false);
}
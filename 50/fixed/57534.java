public net.hybridhacker.visualslice.visualizer.builder.DefaultVisualizerBuilder image(final java.awt.image.BufferedImage image) {
    if ((this.visualizer) == null)
        throw new java.lang.IllegalStateException("No visualizer was chosen yet");
    
    this.visualizer = new net.hybridhacker.visualslice.visualizer.decorators.ImageBackgroundDecorator(this.visualizer);
    return this;
}
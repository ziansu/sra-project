public net.hybridhacker.visualslice.visualizer.builder.DefaultVisualizerBuilder background(final java.awt.Color color) {
    if ((this.visualizer) == null)
        throw new java.lang.IllegalStateException("No visualizer was chosen yet");
    
    this.visualizer = new net.hybridhacker.visualslice.visualizer.decorators.PlainBackgroundDecorator(this.visualizer);
    return this;
}
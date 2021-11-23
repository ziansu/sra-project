public void setOutputValues(java.util.List<java.lang.Object> outputValues) {
    this.outputValues = outputValues;
    valuesClass = nodebox.util.ListUtils.listClass(outputValues);
    nodebox.client.Visualizer visualizer = getVisualizer(outputValues, valuesClass);
    if ((currentVisualizer) != visualizer) {
        resetView();
        currentVisualizer = visualizer;
    }
    com.google.common.base.Preconditions.checkNotNull(currentVisualizer);
    viewerLayer.setBounds(visualizer.getBounds(outputValues, getSize()));
    viewerLayer.setOffset(visualizer.getOffset(outputValues, getSize()));
    repaint();
}
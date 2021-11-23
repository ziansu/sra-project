private void updateVisualizer() {
    if (((visualizer) != null) && (visualizer.isRunning())) {
        visualizer.drawGraph(graph);
    }
}
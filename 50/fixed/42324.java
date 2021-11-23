public final void setGraphSize(final int newGraphSize) {
    graphSize = newGraphSize;
    if ((graphSize) > 0) {
        zoomGraphToFit(graphSize);
        centerGraphPosition(0, graphSize);
    }
}
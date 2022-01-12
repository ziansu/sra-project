public int[] getDimensions() {
    util.X11InfoGatherer gatherer = util.X11InfoGatherer.getX11InfoGatherer();
    return gatherer.getWindowAttributes(parentWindowId);
}
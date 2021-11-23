public java.lang.String updateTitle() {
    util.X11InfoGatherer gatherer = util.X11InfoGatherer.getX11InfoGatherer();
    title = gatherer.getWindowName(titleWindowId);
    return title;
}
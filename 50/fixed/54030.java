private int getMaxYExtent() {
    int result = (viewport.getView().getHeight()) - (viewport.getHeight());
    return result < 0 ? 0 : result;
}
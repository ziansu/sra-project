private void runPositionerInit() {
    positioner.reset(getOrientation());
    positioner.updateHeaderState(findFirstVisibleItemPosition(), getVisibleHeaders(), viewRetriever);
}
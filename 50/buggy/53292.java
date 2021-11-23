private void runPositionerInit() {
    positioner.reset(getOrientation(), findFirstVisibleItemPosition());
    positioner.updateHeaderState(findFirstVisibleItemPosition(), getVisibleHeaders(), viewRetriever);
}
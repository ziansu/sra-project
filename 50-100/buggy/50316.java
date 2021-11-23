@java.lang.Override
public void setDrawDimensions(double zoomLevel) {
    int segmentLength = this.getSequenceLength();
    double width;
    double height;
    width = (((java.lang.Math.log(java.lang.Math.max((segmentLength - 9), 1))) / (java.lang.Math.log(1.15))) * 10) + (min((10 * segmentLength), 100));
    height = NODE_HEIGHT;
    this.setSize((width * zoomLevel), (height * zoomLevel));
}
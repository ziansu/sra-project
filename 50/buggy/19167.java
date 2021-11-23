public void run() {
    long[] position = new long[imageDisplay.numDimensions()];
    imageDisplay.localize(position);
    imagePlaneService.isolatePlane(imageDisplayService.getActiveDataset(), position);
}
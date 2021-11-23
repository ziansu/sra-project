public void run() {
    long[] position = new long[imageDisplay.numDimensions()];
    imageDisplay.localize(position);
    output = imagePlaneService.isolatePlane(imageDisplayService.getActiveDataset(), position);
}
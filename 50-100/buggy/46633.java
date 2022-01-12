@java.lang.Override
public void setDataset(net.imagej.Dataset dataset) {
    this.dataset = dataset;
    datasetView = ((net.imagej.display.DatasetView) (imageDisplayService.createDataView(dataset)));
    datasetView.rebuild();
    imageDisplayService.context().inject(display);
    net.imagej.display.ImageDisplay imageDisplay = new ijfx.service.batch.SilentImageDisplay();
    context.inject(imageDisplay);
    imageDisplay.display(dataset);
    display = imageDisplay;
}
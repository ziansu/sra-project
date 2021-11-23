@java.lang.Override
public void setDataset(net.imagej.Dataset dataset) {
    this.dataset = dataset;
    net.imagej.display.ImageDisplay imageDisplay = new ijfx.service.batch.SilentImageDisplay();
    context.inject(imageDisplay);
    imageDisplay.display(dataset);
    display = imageDisplay;
    datasetView = ((net.imagej.display.DatasetView) (imageDisplayService.createDataView(dataset)));
    datasetView.rebuild();
}
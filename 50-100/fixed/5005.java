public synchronized void setSnapshot(double[] snapshot, fr.inria.soctrace.framesoc.ui.model.TimeInterval interval) {
    fDataset = new org.jfree.data.statistics.HistogramDataset();
    fDataset.setType(DensityHistogramLoader.HISTOGRAM_TYPE);
    if ((snapshot.length) > 0) {
        fDataset.addSeries(DensityHistogramLoader.DATASET_NAME, snapshot, DensityHistogramLoader.NUMBER_OF_BINS);
    }
    fInterval.copy(interval);
    fDirty = true;
}
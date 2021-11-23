public double metricValue() {
    if (!(metricCalculated)) {
        this.checkForRDFDataset();
        metricCalculated = true;
    }
    metricValue = (workingDataDumps) / (totalDataDumps);
    return metricValue;
}
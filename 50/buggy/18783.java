protected void initDataset() throws java.lang.Exception {
    if (context.healthinformatics.sequentialdataanalysis.ComputationData.isComputed()) {
        createDataSet();
    }else {
        throw new java.lang.Exception("There is no data to show in the linechart!");
    }
}
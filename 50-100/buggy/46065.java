public void processorWorkFlow() {
    this.setUpProcess();
    int datasetListCounter = 0;
    for (java.lang.String dataset : datasetList) {
        this.datasetURI = dataset;
        try {
            this.startProcessing();
        } catch (de.unibonn.iai.eis.luzzu.exceptions.ProcessorNotInitialised e) {
            this.processorWorkFlow();
        }
        datasetListCounter++;
        if (datasetListCounter < (datasetList.size()))
            this.reinitialiseProcessors();
        
    }
    this.generateQualityMetadata();
    if (this.genQualityReport)
        this.generateQualityReport();
    
}
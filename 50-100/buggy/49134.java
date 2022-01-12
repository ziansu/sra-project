public java.lang.String enqueueNewAnalysis(com.gmo.processorNode.viewmodel.ViewCreateProcessConfiguration viewConfig, java.lang.String userID, java.lang.String bsuserID, java.lang.String bsuserSecret, java.lang.String bsuserToken, com.gmo.generated.configuration.applicationcontext.LocationType analysisResultsLocationType, java.lang.String analysisResultsLocation) {
    this.analysisResultsLocationType = analysisResultsLocationType;
    this.analysisResultsLocation = analysisResultsLocation;
    com.gmo.sharedobjects.model.processconfiguration.ProcessConfiguration processConfiguration = new com.gmo.modelconverters.ProcessConfigurationConverter().buildDataModelObject(viewConfiguration);
    com.gmo.coreprocessing.Analysis newAnalyse = new com.gmo.coreprocessing.AnalysisOccurence(processConfiguration, userID);
    newAnalyse.init(bsuserID, bsuserSecret, bsuserToken);
    runningAnalysis.add(newAnalyse);
    return newAnalyse.getId();
}
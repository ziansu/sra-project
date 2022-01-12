public void setUpProcess() {
    org.apache.jena.riot.Lang lang = org.apache.jena.riot.RDFLanguages.filenameToLang(datasetURI);
    if ((lang == (org.apache.jena.riot.Lang.NQ)) || (lang == (org.apache.jena.riot.Lang.NQUADS))) {
    }else {
    }
    this.isInitalised = true;
    try {
        this.loadMetrics();
    } catch (de.unibonn.iai.eis.luzzu.exceptions.ExternalMetricLoaderException e) {
        de.unibonn.iai.eis.luzzu.io.impl.SparkStreamProcessor.logger.error(e.getLocalizedMessage());
    }
    this.executor = java.util.concurrent.Executors.newSingleThreadExecutor();
}
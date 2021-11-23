public void setUpProcess() {
    org.apache.jena.riot.Lang lang = org.apache.jena.riot.RDFLanguages.filenameToLang(datasetURI);
    if ((lang == (org.apache.jena.riot.Lang.NQ)) || (lang == (org.apache.jena.riot.Lang.NQUADS))) {
    }else {
    }
    this.isInitalised = true;
    this.executor = java.util.concurrent.Executors.newSingleThreadExecutor();
}
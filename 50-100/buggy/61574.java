@java.lang.Override
public double metricValue() {
    double validProv = 0.0;
    for (java.lang.String s : dataset.values())
        if (!(s.equals("")))
            validProv++;
        
    
    statsLogger.info("Basic Provenance Metric. Dataset: {} - Valid Provenance {}, Dataset Size {}", de.unibonn.iai.eis.luzzu.properties.EnvironmentProperties.getInstance().getDatasetURI(), validProv, dataset.size());
    return validProv / ((double) (dataset.size()));
}
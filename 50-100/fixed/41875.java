private org.deegree.services.metadata.provider.DefaultOWSMetadataProvider createProvider() {
    java.util.List<org.deegree.commons.ows.metadata.DatasetMetadata> datasetMetadata = new java.util.ArrayList<org.deegree.commons.ows.metadata.DatasetMetadata>();
    datasetMetadata.add(createDatasetMetadata("name1", "http:/url.org/1"));
    datasetMetadata.add(createDatasetMetadata("name1", "http:/url.org/2"));
    datasetMetadata.add(createDatasetMetadata("name2", "http:/url.org/3"));
    return new org.deegree.services.metadata.provider.DefaultOWSMetadataProvider(null, null, null, datasetMetadata, null);
}
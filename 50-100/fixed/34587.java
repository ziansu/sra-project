public static java.util.List<java.lang.String> getDatasetProjectCodes(java.lang.String datasetId) {
    return org.icgc.dcc.repository.ega.util.EGAProjectDatasets.DATASETS.stream().filter(( r) -> datasetId.equals(r.getDatasetId())).map(org.icgc.dcc.repository.ega.util.EGAProjectDatasets.Record::getProjectCode).collect(org.icgc.dcc.common.core.util.stream.Collectors.toImmutableList());
}
public static java.util.List<java.lang.String> getDatasetProjectCodes(@lombok.NonNull
java.lang.String datasetId) {
    return org.icgc.dcc.repository.ega.util.EGAProjectDatasets.DATASETS.stream().filter(( r) -> r.getDatasetId().equals(datasetId)).map(org.icgc.dcc.repository.ega.util.EGAProjectDatasets.Record::getProjectCode).collect(org.icgc.dcc.common.core.util.stream.Collectors.toImmutableList());
}
private void createDataSetIds(java.lang.Iterable<eu.dzhw.fdz.metadatamanagement.datasetmanagement.domain.DataSet> dataSets) {
    if (dataSets != null) {
        dataSetIds = new java.util.ArrayList<>();
        for (eu.dzhw.fdz.metadatamanagement.datasetmanagement.domain.DataSet dataSet : dataSets) {
            dataSetIds.add(dataSet.getId());
        }
    }
}
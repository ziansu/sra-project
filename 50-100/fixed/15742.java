@java.lang.Override
public java.util.Collection<uk.ac.rdg.resc.edal.dataset.Dataset> getAllDatasets() {
    java.util.List<uk.ac.rdg.resc.edal.dataset.Dataset> allDatasets = new java.util.ArrayList<uk.ac.rdg.resc.edal.dataset.Dataset>();
    for (uk.ac.rdg.resc.edal.dataset.Dataset dataset : datasets.values()) {
        uk.ac.rdg.resc.edal.ncwms.config.NcwmsDataset datasetInfo = config.getDatasetInfo(dataset.getId());
        if (((datasetInfo != null) && (!(datasetInfo.isDisabled()))) && (datasetInfo.isReady())) {
            allDatasets.add(dataset);
        }
    }
    return allDatasets;
}
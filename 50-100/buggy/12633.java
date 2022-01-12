static org.eclipse.january.dataset.Dataset santiseDataset(org.eclipse.january.dataset.IDataset data) {
    org.eclipse.january.dataset.Dataset tmp = org.eclipse.january.dataset.DatasetUtils.convertToDataset(data);
    if ((tmp.getStrides()) != null) {
        tmp = tmp.getSlice();
        tmp.setName(data.getName());
    }
    tmp = tmp.getView(false);
    tmp.clearMetadata(org.eclipse.january.metadata.StatisticsMetadata.class);
    return tmp;
}
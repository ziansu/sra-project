private void loadAndBuildDataset(java.io.File dir) {
    java.util.Map<java.lang.String, java.util.Collection<model.datasource.FragmentDataSource>> dataset = model.DataFileUtils.getInstance().loadFragmentDataSource(dir);
    for (java.util.Map.Entry<java.lang.String, java.util.Collection<model.datasource.FragmentDataSource>> pair : dataset.entrySet()) {
        view.component.dataview.DatasetView actionView = new view.component.dataview.DatasetView(pair.getKey(), datasetManager);
        for (model.datasource.FragmentDataSource dataSource : pair.getValue()) {
            actionView.addNewData(dataSource);
        }
        datasetBox.add(actionView, 0);
    }
    layoutDatasetPanel();
}
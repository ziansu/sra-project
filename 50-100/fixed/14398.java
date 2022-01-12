private void updateObjectiveViewer() {
    if ((selectedDataset) != null) {
        selectedDatasetSize = selectedDataset.getSize();
        try {
            org.corehunter.data.CoreHunterData coreHunterData = org.corehunter.ui.Activator.getDefault().getDatasetServices().getCoreHunterData(selectedDataset.getUniqueIdentifier());
            objectiveViewer.setCoreHunterData(coreHunterData);
        } catch (uno.informatics.data.dataset.DatasetException e) {
            shellUtilitiies.handleError("Can not update objective viewer!", "Can not update objective viewer, see error message for more details!", e);
        }
    }else {
        selectedDatasetSize = 0;
        objectiveViewer.setCoreHunterData(null);
    }
    objectiveViewer.setObjectives(getObjectives(selectedDataset));
}
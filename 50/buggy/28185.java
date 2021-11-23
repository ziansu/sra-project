public void doEditNewExperiment() {
    jobEditor = new org.gridchem.client.gui.jobsubmission.EditJobPanel();
    int size = org.gridchem.client.stuffInside.queueModel.getSize();
    org.gridchem.client.stuffInside.queueList.setSelectedIndex((size + 1));
    java.lang.System.err.println(("job index is: " + (size + 1)));
}
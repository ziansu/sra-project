public void doAction(com.metsci.laproc.uicomponents.DataSetTable dataSetTable) {
    for (com.metsci.laproc.plotting.GraphableData<?> data : dataSetTable.getSelectedValues()) {
        this.reference.addDataToGraph(data);
    }
}
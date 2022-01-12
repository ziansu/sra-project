@java.lang.Override
protected void done() {
    try {
        get();
    } catch (java.lang.InterruptedException ignore) {
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    }
    _modelSelection.put(selected, 0);
    if ((_titleList.getSelectedValue()) == selected) {
        _recordingTable.getSelectionModel().setSelectionInterval(0, _modelSelection.get(selected));
        _recordingTable.setColumnSelectionInterval(0, 0);
    }
}
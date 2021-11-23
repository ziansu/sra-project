@java.lang.Override
public void updateLists() {
    scl.setVisibleRange(0, deselectedModel.getList().size());
    scl.setRowCount(deselectedModel.getList().size(), true);
    ccl.setVisibleRange(0, selectedModel.getList().size());
    ccl.setRowCount(selectedModel.getList().size(), true);
    deselectedModel.refresh();
    selectedModel.refresh();
}
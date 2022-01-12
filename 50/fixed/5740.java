public void updateData(cs2103.v15_1j.jimjim.model.DataLists tempList) {
    this.lists = tempList;
    dayPickerPaneController.refreshData(lists);
    floatingTaskPaneController.refreshData(lists);
}
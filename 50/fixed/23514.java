public void refreshListView() {
    editedOst = false;
    allOsts = dbHandler.getAllOsts();
    currOstList = getCurrDispOstList();
    customAdapter.updateList(currOstList, allOsts);
}
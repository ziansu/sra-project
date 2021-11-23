public void setUpLists(java.util.ArrayList<logic.Task> list) {
    if (list == null) {
        return ;
    }
    _mainList.addAll(list);
    updateLists();
}
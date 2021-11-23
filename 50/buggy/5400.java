public void setUpLists(java.util.ArrayList<logic.Task> list) {
    if (_mainList.isEmpty()) {
        return ;
    }
    _mainList.addAll(list);
    updateLists();
}
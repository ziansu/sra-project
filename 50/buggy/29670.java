public void clear() {
    int size = getSize();
    doneList.clear();
    todoList.clear();
    super.fireIntervalRemoved(this, 0, size);
}
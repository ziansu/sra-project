private void addInternal() {
    int originalSize = taskList.size();
    int newSize = originalSize + 1;
    if ((index) != 0) {
        taskList.add(((index) - 1), task);
    }else {
        taskList.add(task);
    }
    if ((taskList.size()) == newSize)
        addedInternal = true;
    
}
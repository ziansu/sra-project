private void executeWithName(java.lang.String name) {
    for (int index = 0; index < (taskList.size()); index++) {
        if (taskList.get(index).getName().equalsIgnoreCase(name)) {
            resultTaskIndexes.add(index);
        }
    }
    if ((resultTaskIndexes.size()) == 1) {
        taskList.remove(resultTaskIndexes.get(0));
    }else {
    }
}
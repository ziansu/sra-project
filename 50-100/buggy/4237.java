private int getArrayListIndexOfTask(int id) {
    int index = 0;
    for (int i = 0; i < (tasksList.size()); i++) {
        if ((tasksList.get(i).getIndex()) == id) {
            i = index;
        }
    }
    return index;
}
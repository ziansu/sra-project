void displayTaskList(java.util.ArrayList<java.lang.String> tasks) {
    int size = tasks.size();
    for (int i = 0; i < size; i++) {
        TaskDisplayArea.append(((((i + 1) + ". ") + (tasks.get(i))) + "\r\n"));
    }
}
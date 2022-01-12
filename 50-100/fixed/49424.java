private java.lang.String searchTask() {
    java.lang.String search = "";
    for (int i = 0; i < (tasks.size()); i++) {
        if (tasks.get(i).contains(commandDetails)) {
            search += ((i + 1) + ". ") + (tasks.get(i).toString());
        }
    }
    if (search.isEmpty()) {
        search = GSDControl.DISPLAY_TASK_NOT_FOUND;
    }
    return search;
}
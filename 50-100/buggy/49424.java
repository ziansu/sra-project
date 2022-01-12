private java.lang.String searchTask() {
    java.lang.String search = "";
    for (int i = 0; i < (tasks.size()); i++) {
        if (tasks.get(i).getDescription().contains(commandDetails.getDescription())) {
            search += ((i + 1) + ". ") + (tasks.get(i).toString());
        }
    }
    if (search.isEmpty()) {
        search = GSDControl.DISPLAY_TASK_NOT_FOUND;
    }
    return search;
}
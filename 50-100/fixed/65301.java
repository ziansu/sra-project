private boolean taskWithTitleExists(java.lang.String title) throws java.io.IOException {
    com.google.api.services.tasks.model.Tasks allTasks = gtasksService.getAllGtasksFromListId(com.todoroo.astrid.gtasks.GtasksSyncOnSaveTest.DEFAULT_LIST, false, false, 0);
    java.util.List<com.todoroo.astrid.data.Task> items = allTasks.getItems();
    if (items != null) {
        for (com.todoroo.astrid.data.Task t : items) {
            if (t.getTitle().equals(title))
                return true;
            
        }
    }
    return false;
}
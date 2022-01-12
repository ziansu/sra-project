private boolean listHasTaskWithTitle(java.lang.String listId, java.lang.String title) throws java.lang.Exception {
    com.google.api.services.tasks.model.Tasks newListTasks = com.todoroo.astrid.gtasks.GtasksApiTest.service.getAllGtasksFromListId(listId, false, false);
    java.util.List<com.google.api.services.tasks.model.Task> items = newListTasks.getItems();
    if (items != null) {
        for (com.google.api.services.tasks.model.Task t : items) {
            if (t.getTitle().equals(title)) {
                return true;
            }
        }
    }
    return false;
}
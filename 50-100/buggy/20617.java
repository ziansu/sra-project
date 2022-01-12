private void setupTestList() throws java.lang.Exception {
    com.google.api.services.tasks.model.Tasks defaultListTasks = com.todoroo.astrid.sync.repeats.RepeatTestsGtasksSync.gtasksService.getAllGtasksFromListId(com.todoroo.astrid.sync.repeats.RepeatTestsGtasksSync.DEFAULT_LIST, false, false);
    java.util.List<com.todoroo.astrid.data.Task> items = defaultListTasks.getItems();
    if (items != null) {
        for (com.todoroo.astrid.data.Task t : items) {
            com.todoroo.astrid.sync.repeats.RepeatTestsGtasksSync.gtasksService.deleteGtask(com.todoroo.astrid.sync.repeats.RepeatTestsGtasksSync.DEFAULT_LIST, t.getId());
        }
    }
}
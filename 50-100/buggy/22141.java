private boolean taskWithTitleExists(java.lang.String title) throws java.lang.Exception {
    com.google.api.services.tasks.model.Tasks defaultList = com.todoroo.astrid.gtasks.GtasksApiTest.service.getAllGtasksFromListId(com.todoroo.astrid.gtasks.GtasksApiTest.DEFAULT_LIST, false, false);
    java.util.List<com.google.api.services.tasks.model.Task> items = defaultList.getItems();
    if (items != null) {
        for (com.google.api.services.tasks.model.Task t : items) {
            if (t.getTitle().equals(title))
                return true;
            
        }
    }
    return false;
}
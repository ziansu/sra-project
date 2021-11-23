private void clearDefaultList() {
    try {
        com.google.api.services.tasks.model.Tasks tasks = com.todoroo.astrid.gtasks.GtasksApiTest.service.getAllGtasksFromListId(com.todoroo.astrid.gtasks.GtasksApiTest.DEFAULT_LIST, false, false, 0);
        java.util.List<com.google.api.services.tasks.model.Task> items = tasks.getItems();
        if (items != null) {
            for (com.google.api.services.tasks.model.Task t : items) {
                com.todoroo.astrid.gtasks.GtasksApiTest.service.deleteGtask(com.todoroo.astrid.gtasks.GtasksApiTest.DEFAULT_LIST, t.getId());
            }
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        fail("Failed to clear default list");
    }
}
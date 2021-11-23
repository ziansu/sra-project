public static com.todoroo.astrid.data.Task createWithValues(android.content.ContentValues values, java.lang.String title, com.todoroo.astrid.service.TaskService taskService, com.todoroo.astrid.service.MetadataService metadataService) {
    com.todoroo.astrid.data.Task task = new com.todoroo.astrid.data.Task();
    return com.todoroo.astrid.service.TaskService.createWithValues(task, values, title, taskService, metadataService);
}
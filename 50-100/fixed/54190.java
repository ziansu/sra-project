public void trackTags(taskey.logic.ProcessedObject po) {
    taskey.logic.Task task = po.getTask();
    if (task != null) {
        java.util.ArrayList<java.lang.String> tags = task.getTaskTags();
        if (tags != null) {
            for (int i = 0; i < (tags.size()); i++) {
                if (!(tagDB.hasTag(tags.get(i)))) {
                    tagDB.addTag(tags.get(i));
                }
            }
        }
    }
}
public void addExistingTasksToStory(java.lang.String[] selectedTaskIds, long storyId) {
    java.util.ArrayList<java.lang.Long> tasksId = new java.util.ArrayList<java.lang.Long>();
    for (java.lang.String task : selectedTaskIds) {
        tasksId.add(java.lang.Long.parseLong(task));
    }
    mSprintBacklogMapper.addExistingTasksToStory(tasksId, storyId);
}
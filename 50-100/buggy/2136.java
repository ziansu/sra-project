public boolean isTaskInSprint(com.scrumiverse.model.scrumCore.Task task, com.scrumiverse.model.scrumCore.Sprint sprint) {
    boolean result = false;
    for (com.scrumiverse.model.scrumCore.UserStory forUserstory : sprint.getUserStories()) {
        for (com.scrumiverse.model.scrumCore.Task forTask : forUserstory.getTasks()) {
            if (forTask.equals(task)) {
                result = true;
            }
        }
    }
    return result;
}
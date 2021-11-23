public api.v1.model.TaskList add(api.v1.model.TaskList tl) throws api.v1.error.BusinessException, api.v1.error.SystemException {
    api.v1.repo.TaskListRepository.LOGGER.debug("Here we are placing the TaskList in the repository.   {}", tl.toJson());
    int taskListId = 0;
    while (taskListMap.containsKey(taskListId))
        taskListId++;
    
    tl.setId(taskListId);
    taskListMap.put(taskListId, tl);
    return new api.v1.model.TaskList(tl);
}
public api.v1.model.TaskList add(api.v1.model.TaskList tl) throws api.v1.error.BusinessException, api.v1.error.SystemException {
    int taskListId = 0;
    while (taskListMap.containsKey(taskListId))
        taskListId++;
    
    tl.setId(taskListId);
    taskListMap.put(taskListId, tl);
    return new api.v1.model.TaskList(tl);
}
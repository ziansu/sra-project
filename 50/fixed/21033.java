@ru.fsep.enterprise.fseper.controllers.RequestMapping(value = "tasks/{task-id}.json", method = RequestMethod.GET)
public org.springframework.http.ResponseEntity<ru.fsep.enterprise.fseper.controllers.dto.ResponseObjectDto> getTask(@ru.fsep.enterprise.fseper.controllers.PathVariable(value = "task-id")
int id) {
    ru.fsep.enterprise.fseper.models.Task task = usersServiceFacade.getTask(id);
    ru.fsep.enterprise.fseper.controllers.dto.TaskDto taskDto = converterOfTasksAndStepsEntities.fromTask(task);
    return ru.fsep.enterprise.fseper.controllers.ResponseBuilder.buildResponseGet(taskDto);
}
public ru.jvdev.demoapp.server.model.Task fromDTO(ru.jvdev.demoapp.server.dto.TaskDTO dto) {
    ru.jvdev.demoapp.server.model.Task task = new ru.jvdev.demoapp.server.model.Task();
    task.setTitle(dto.getTitle());
    task.setDueDate(dto.getDueDate());
    int employeeId = dto.getAssigneeId();
    if (employeeId > 0) {
        task.setAssignee(findEmployeeOr404(employeeId));
    }else {
        task.setAssignee(null);
    }
    return task;
}
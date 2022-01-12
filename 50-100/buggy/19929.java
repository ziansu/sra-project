private void moveRemainingTasks(java.util.List<has.Task.Task> nextShiftTasks) throws java.lang.Exception {
    for (has.Task.Task task : nextShiftTasks) {
        has.Employee.EmployeeDTO employeeDTO;
        task = taskRepository.save(assignTask(task, has.Utils.TaskHandler.NOT_INITIALIZED));
        employeeDTO = employeeService.transferEmployeeToDTO(task.getAssignee().getId());
        taskRepository.save(organizeTasks(employeeDTO));
    }
}
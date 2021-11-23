public java.util.List<has.Task.Task> equalize() throws java.lang.Exception {
    java.util.List<has.Employee.EmployeeDTO> employees = taskHandler.findEmployeesOnShiftDTO(new org.joda.time.LocalTime(), false);
    java.util.List<has.Task.Task> tasks = repo.save(taskHandler.equalizeTasks(taskHandler.findEmployeesOnShiftDTO(new org.joda.time.LocalTime(), true)));
    organize(employees);
    return tasks;
}
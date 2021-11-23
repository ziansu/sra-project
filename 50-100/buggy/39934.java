public payroll.tasks.LaborTask getLaborTask(java.lang.String taskName) {
    payroll.tasks.LaborTask newTask;
    if (standardLaborMap.containsKey(taskName)) {
        return standardLaborMap.get(taskName);
    }else
        if (shsLaborMap.containsKey(taskName)) {
            return shsLaborMap.get(taskName);
        }
    
    return null;
}
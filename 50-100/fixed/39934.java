public payroll.tasks.LaborTask getLaborTask(java.lang.String taskName) {
    if (standardLaborMap.containsKey(taskName)) {
        return standardLaborMap.get(taskName);
    }else
        if (shsLaborMap.containsKey(taskName)) {
            return shsLaborMap.get(taskName);
        }
    
    return null;
}
public void changeTaskDate(java.lang.Long taskID, java.util.Date dateOfTask) {
    com.softserve.edu.entity.verification.calibration.CalibrationTask task = taskRepository.findOne(taskID);
    if ((task == null) || (dateOfTask == null)) {
        throw new java.lang.IllegalArgumentException();
    }
    task.setDateOfTask(dateOfTask);
    try {
        taskRepository.save(task);
    } catch (java.lang.Exception e) {
        throw new java.lang.IllegalArgumentException(e);
    }
}
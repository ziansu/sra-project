protected org.jimple.planner.task.Task staticTask(java.lang.String title, java.time.LocalDateTime fromtime) {
    org.jimple.planner.task.Task task = new org.jimple.planner.task.Task(title);
    task.setType(Constants.TYPE_STATIC);
    task.setIsOverDue(false);
    task.setToDate(fromtime.toString());
    return task;
}
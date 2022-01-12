private void updateTaskStatus(final org.ow2.proactive.scheduler.common.task.TaskState task, org.hibernate.Session session) {
    java.lang.String taskUpdate = "update TaskData task set task.taskStatus = :taskStatus where task.id = :taskId";
    org.hibernate.Query taskUpdateQuery = session.createQuery(taskUpdate);
    org.ow2.proactive.scheduler.common.task.TaskInfo taskInfo = task.getTaskInfo();
    taskUpdateQuery.setParameter("taskStatus", taskInfo.getStatus()).setParameter("taskId", org.ow2.proactive.scheduler.core.db.SchedulerDBManager.taskId(task.getId())).executeUpdate();
}
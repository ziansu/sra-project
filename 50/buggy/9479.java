@java.lang.Override
public int compare(org.ow2.proactive.scheduler.common.task.TaskState task1, org.ow2.proactive.scheduler.common.task.TaskState task2) {
    return java.lang.Long.valueOf(task1.getFinishedTime()).compareTo(task2.getFinishedTime());
}
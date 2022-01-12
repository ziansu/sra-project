public void updateTaskComplete(int taskId) {
    java.lang.String taskName = taskIdToTaskSubject(taskId);
    int[] bitMap = taskProgress.get(taskName);
    bitMap[((taskId - 1) % (Constants.TOTAL_LESSONS_IN_SUBJECT))] = 1;
    codingcareers.webapp.client.Controller.log(((taskName + ", ") + (java.lang.Integer.toString(((taskId - 1) % ((Constants.TOTAL_LESSONS_IN_SUBJECT) + 1))))));
    taskProgress.put(taskName, bitMap);
}
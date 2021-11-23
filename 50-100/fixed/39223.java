private static void addAsCandidate(final java.util.List<org.activiti.engine.task.Task> taskList, final java.lang.String substitute) {
    if ((taskList == null) || (taskList.isEmpty())) {
        return ;
    }
    java.lang.Thread reassignThread = new java.lang.Thread() {
        public void run() {
            for (org.activiti.engine.task.Task task : taskList) {
                org.wso2.carbon.bpmn.people.substitution.UserSubstitutionOperations.taskService.addCandidateUser(task.getId(), substitute);
            }
        }
    };
    org.wso2.carbon.bpmn.people.substitution.UserSubstitutionOperations.executeInThreadPool(reassignThread);
}
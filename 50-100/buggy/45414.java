private java.util.List<com.equalinformation.bpm.poc.consumer.ws.domain.Task> fetchHistoricTaskDataFromActivitiEngine() {
    historicTaskList = activitiRESTClient.getHistoricActivitiInstances();
    if ((taskList.size()) >= 1) {
        java.lang.System.out.println(("First element ID: " + (taskList.get(0).getId())));
    }
    return taskList;
}
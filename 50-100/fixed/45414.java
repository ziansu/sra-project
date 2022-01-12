private java.util.List<com.equalinformation.bpm.poc.consumer.ws.domain.Task> fetchHistoricTaskDataFromActivitiEngine() {
    historicTaskList = activitiRESTClient.getHistoricActivitiInstances();
    if ((historicTaskList.size()) >= 1) {
        java.lang.System.out.println(("First element ID: " + (historicTaskList.get(0).getId())));
    }
    return historicTaskList;
}
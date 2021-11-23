private boolean isProcessDeployed(java.lang.String key) {
    java.lang.String checkDeploymentUrl = (((ActivitiEngine.URL) + "/service/repository/deployments?name=") + key) + ".bpmn";
    org.json.JSONObject result = betsy.bpmn.engines.JsonHelper.get(checkDeploymentUrl, 200);
    if ((result.getInt("size")) != 1) {
        return false;
    }
    return true;
}
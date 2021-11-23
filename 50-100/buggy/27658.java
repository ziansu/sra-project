private static java.lang.String getTaskListString(java.util.List<java.lang.String> taskList) {
    if ((taskList != null) & (!(taskList.isEmpty()))) {
        java.lang.String list = "";
        for (java.lang.String id : taskList) {
            list = (list + id) + (org.wso2.carbon.bpmn.extensions.substitution.UserSubstitutionOperations.LIST_SEPARATOR);
        }
        return list;
    }else {
        return null;
    }
}
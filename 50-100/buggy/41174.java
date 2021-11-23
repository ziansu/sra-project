private java.util.List<java.lang.Long> getRefNums(ee.telekom.workflow.facade.model.CreateWorkflowInstance[] requests) {
    java.util.List<java.lang.Long> result = new java.util.ArrayList(requests.length);
    for (ee.telekom.workflow.facade.model.CreateWorkflowInstance request : requests) {
        result.add(request.getRefNum());
    }
    return result;
}
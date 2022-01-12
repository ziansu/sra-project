public void setCurrentFlowElement(org.activiti.bpmn.model.FlowElement currentFlowElement) {
    this.currentFlowElement = currentFlowElement;
    if (currentFlowElement != null) {
        this.activityId = currentFlowElement.getId();
    }else {
        this.activityId = null;
    }
}
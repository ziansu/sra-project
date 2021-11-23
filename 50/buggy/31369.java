private azkaban.execapp.FlowRunner createFlowRunner(final azkaban.execapp.EventCollectorListener eventCollector, final java.lang.String flowName) throws java.lang.Exception {
    return createFlowRunner(eventCollector, flowName, FailureAction.FINISH_CURRENTLY_RUNNING);
}
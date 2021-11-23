@java.lang.Override
protected java.util.List<org.wso2.siddhi.query.api.definition.Attribute> init(org.wso2.siddhi.query.api.definition.AbstractDefinition abstractDefinition, org.wso2.siddhi.core.executor.ExpressionExecutor[] expressionExecutors, org.wso2.siddhi.core.config.ExecutionPlanContext executionPlanContext, boolean b) {
    if ((expressionExecutors.length) != 9) {
        throw new java.lang.RuntimeException("Required Parameters : Nine");
    }
    java.util.List<org.wso2.siddhi.query.api.definition.Attribute> attributeList = new java.util.ArrayList<org.wso2.siddhi.query.api.definition.Attribute>();
    friendshipGraph = new org.wso2.siddhi.debs2016.graph.Graph();
    commentStore = null;
    return attributeList;
}
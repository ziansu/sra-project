private static org.elasticsearch.common.xcontent.XContentBuilder setField(org.elasticsearch.common.xcontent.XContentBuilder object, java.lang.String field, com.docdoku.core.workflow.Workflow value, float coef) throws java.io.IOException {
    if (value != null) {
        java.lang.String finalLifeCycleState = value.getFinalLifeCycleState();
        finalLifeCycleState = ((finalLifeCycleState != null) && (!(finalLifeCycleState.isEmpty()))) ? finalLifeCycleState : " ";
        return object.field(field, ("" + finalLifeCycleState), coef);
    }
    return null;
}
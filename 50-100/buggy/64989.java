@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getReturnValues() {
    org.talend.components.api.component.runtime.Result result = new org.talend.components.api.component.runtime.Result();
    result.totalCount = apiCalls;
    java.util.Map<java.lang.String, java.lang.Object> res = result.toMap();
    res.put(org.talend.components.marketo.MarketoComponentDefinition.RETURN_NB_CALL, apiCalls);
    res.put(org.talend.components.api.component.ComponentDefinition.RETURN_ERROR_MESSAGE, errorMessage);
    return res;
}
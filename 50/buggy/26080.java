@java.lang.Override
public java.util.Map<java.lang.String, java.lang.Object> getReturnValues() {
    org.talend.components.api.component.runtime.Result result = new org.talend.components.api.component.runtime.Result();
    result.totalCount = dataCount;
    return result.toMap();
}
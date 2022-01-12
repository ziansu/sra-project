@java.lang.Override
public void setValue(java.lang.String key, java.lang.String value) {
    com.google.common.base.Preconditions.checkNotNull(nodeName, "Node name cannot be null.");
    co.cask.cdap.internal.app.runtime.workflow.WorkflowTokenValue tokenValue = tokenValueMap.get(key);
    if (tokenValue == null) {
        tokenValue = new co.cask.cdap.internal.app.runtime.workflow.WorkflowTokenValue();
    }
    tokenValue.putValue(nodeName, value);
    tokenValueMap.put(key, tokenValue);
}
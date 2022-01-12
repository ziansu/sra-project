@java.lang.Override
public co.cask.cdap.api.workflow.Value get(java.lang.String key, java.lang.String nodeName, co.cask.cdap.internal.app.runtime.workflow.Scope scope) {
    java.util.List<co.cask.cdap.api.workflow.NodeValue> nodeValueList = tokenValueMap.get(scope).get(key);
    if (nodeValueList == null) {
        return null;
    }
    for (co.cask.cdap.api.workflow.NodeValue nodeValue : nodeValueList) {
        if (nodeValue.getNodeName().equals(nodeName)) {
            return nodeValue.getValue();
        }
    }
    return null;
}
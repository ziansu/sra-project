@java.lang.Override
protected java.util.Collection<java.lang.Object> allContentsFromModel() {
    java.util.ArrayList<java.lang.Object> elements = new java.util.ArrayList<java.lang.Object>();
    org.eclipse.epsilon.emc.json.JsonUtil.collectChildElements(root, elements);
    return elements;
}
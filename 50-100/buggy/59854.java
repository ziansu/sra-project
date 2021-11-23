private java.lang.Object readResolve() {
    if ((properties) == null) {
        properties = new hudson.util.DescribableList<hudson.tools.ToolProperty<?>, hudson.tools.ToolPropertyDescriptor>(hudson.model.Saveable.NOOP);
    }
    for (hudson.tools.ToolProperty<?> p : properties) {
        _setTool(p, this);
    }
    return this;
}
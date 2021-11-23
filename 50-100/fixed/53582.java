public org.apache.wicket.Component getComponent(java.lang.String path, boolean visibleInHierarchy) {
    org.apache.wicket.Component component = tester.getLastRenderedPage().get(getPath(path));
    return (!visibleInHierarchy) || ((component != null) && (component.isVisibleInHierarchy())) ? component : null;
}
public org.apache.wicket.Component getComponent(java.lang.String path, boolean visibleInHierarchy) {
    org.apache.wicket.Component component = tester.getLastRenderedPage().get(getPath(path));
    java.lang.System.out.println((component == null));
    return (!visibleInHierarchy) || (component.isVisibleInHierarchy()) ? component : null;
}
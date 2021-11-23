private void addPathToProperty(org.apache.tools.ant.types.Path p, java.lang.String propertyName) {
    org.apache.tools.ant.types.Path old = ((org.apache.tools.ant.types.Path) (retrolambdaProperties.get(propertyName)));
    org.apache.tools.ant.types.Path result = new org.apache.tools.ant.types.Path(getProject());
    result.append(old);
    result.append(p);
    retrolambdaProperties.put(propertyName, result);
}
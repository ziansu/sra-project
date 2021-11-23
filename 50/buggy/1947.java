public static java.lang.String getRootLocation(java.lang.String componentName) throws org.apache.ofbiz.base.component.ComponentException {
    org.apache.ofbiz.base.component.ComponentConfig cc = org.apache.ofbiz.base.component.ComponentConfig.getComponentConfig(componentName);
    if (cc == null) {
        throw new org.apache.ofbiz.base.component.ComponentException(("Could not find component with name: " + componentName));
    }
    return cc.getRootLocation();
}
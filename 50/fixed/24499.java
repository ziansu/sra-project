@java.lang.Override
protected java.lang.String calculate() {
    java.lang.Object value = beanConfigUtil.getAttributeValue(selectedElement, GlobalBeanEIP.PROP_CLASS);
    if (value instanceof java.lang.String) {
        return ((java.lang.String) (value));
    }
    return null;
}
@java.lang.Override
protected java.lang.Object calculate() {
    return beanConfigUtil.getAttributeValue(selectedElement, GlobalBeanEIP.PROP_CLASS);
}
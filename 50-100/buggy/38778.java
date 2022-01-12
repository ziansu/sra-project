@java.lang.Override
protected void doSetValue(java.lang.Object value) {
    final java.lang.String strValue = ((java.lang.String) (value));
    final java.lang.String oldValue = ((java.lang.String) (beanConfigUtil.getAttributeValue(selectedElement, GlobalBeanEIP.PROP_ID)));
    if (!(oldValue.contentEquals(strValue))) {
        beanConfigUtil.setAttributeValue(selectedElement, GlobalBeanEIP.PROP_CLASS, strValue);
    }
    getValue();
}
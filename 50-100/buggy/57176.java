@java.lang.Override
protected void doSetValue(java.lang.Object value) {
    final java.lang.String beanTag = beanConfigUtil.getFactoryBeanTag(selectedElement);
    final java.lang.String strValue = ((java.lang.String) (value));
    final java.lang.String oldValue = ((java.lang.String) (beanConfigUtil.getAttributeValue(selectedElement, beanTag)));
    if (!(oldValue.contentEquals(strValue))) {
        beanConfigUtil.setAttributeValue(selectedElement, beanTag, strValue);
    }
    getValue();
}
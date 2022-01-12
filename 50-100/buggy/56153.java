private void modifyProperty(org.springframework.beans.MutablePropertyValues propertyValues, org.springframework.beans.BeanWrapper target, org.springframework.beans.PropertyValue propertyValue, int index) {
    java.lang.String oldName = propertyValue.getName();
    java.lang.String name = normalizePath(target, oldName);
    if (!(name.equals(oldName))) {
        propertyValues.setPropertyValueAt(new org.springframework.beans.PropertyValue(name, propertyValue.getValue()), index);
    }
}
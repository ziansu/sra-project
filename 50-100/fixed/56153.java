private org.springframework.beans.PropertyValue modifyProperty(org.springframework.beans.BeanWrapper target, org.springframework.beans.PropertyValue propertyValue) {
    java.lang.String oldName = propertyValue.getName();
    java.lang.String name = normalizePath(target, oldName);
    if (!(name.equals(oldName))) {
        return new org.springframework.beans.PropertyValue(name, propertyValue.getValue());
    }
    return propertyValue;
}
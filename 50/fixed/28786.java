private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
    return new org.hibernate.property.access.spi.GetterFieldImpl.SerialForm(containerClass, propertyName, field, getterMethod);
}
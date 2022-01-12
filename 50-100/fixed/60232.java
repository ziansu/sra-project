public static boolean isBeanPropertyConstrained(final java.lang.Class<?> beanType, final java.lang.String propertyName) {
    final javax.validation.Validator beanValidator = org.jowidgets.cap.common.api.CapCommonToolkit.beanValidator();
    if (beanValidator != null) {
        final javax.validation.metadata.BeanDescriptor constraintsForClass = beanValidator.getConstraintsForClass(beanType);
        if (constraintsForClass != null) {
            final javax.validation.metadata.PropertyDescriptor constraintsForProperty = constraintsForClass.getConstraintsForProperty(propertyName);
            if (constraintsForProperty != null) {
                return constraintsForProperty.hasConstraints();
            }
        }
    }
    return false;
}
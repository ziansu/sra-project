public java.util.Map<java.lang.Class<?>, java.lang.Boolean> getConstraintsMap() {
    if ((constraintsOnClasses) == null) {
        try {
            constraintsOnClasses = future.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
            org.eclipse.persistence.jaxb.BeanValidationHelper.LOGGER.warning("Error parsing validation.xml");
        }
    }
    return constraintsOnClasses;
}
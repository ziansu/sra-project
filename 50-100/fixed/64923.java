private void registerResourceLocatorUnitOfWorkAnnotations(org.glassfish.jersey.server.model.ResourceMethod method) {
    if ((method.getType()) != (ResourceMethod.JaxrsType.SUB_RESOURCE_LOCATOR))
        return ;
    
    io.dropwizard.hibernate.UnitOfWork annotation;
    for (java.lang.reflect.Method responseMethod : method.getInvocable().getRawResponseType().getMethods()) {
        annotation = responseMethod.getAnnotation(io.dropwizard.hibernate.UnitOfWork.class);
        if (annotation != null) {
            this.methodMap.put(responseMethod, annotation);
        }
    }
}
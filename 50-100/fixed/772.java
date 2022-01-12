private void firePropertyChange(org.cerberus.crud.entity.Parameter parameter) {
    java.util.Set<org.cerberus.crud.service.impl.ParameterAware> existingRegistration;
    synchronized(propertyRegistration) {
        existingRegistration = propertyRegistration.get(parameter.getParam());
    }
    if (existingRegistration != null) {
        for (org.cerberus.crud.service.impl.ParameterAware parameterAware : existingRegistration) {
            parameterAware.parameterChanged(parameter);
        }
    }
}
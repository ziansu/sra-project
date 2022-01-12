public <T> T invokeCompartment(java.lang.String methodName, java.lang.Class<T> returnType, java.lang.Class[] arguementTypes, java.lang.Object[] argumentValues) {
    return registryManager.invokeCompartment(false, this, methodName, returnType, arguementTypes, argumentValues);
}
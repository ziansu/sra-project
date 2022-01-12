public <T> T invokeCompartment(java.lang.String methodName, java.lang.Class<T> returnType) {
    return registryManager.invokeCompartment(false, this, methodName, returnType, null, null);
}
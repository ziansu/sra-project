public <T> T invokeCompartment(java.lang.String methodName, java.lang.Class<T> returnType) {
    return registryManager.invokeCompartment(null, false, this, methodName, returnType, null, null);
}
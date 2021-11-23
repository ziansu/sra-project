protected void registerTypeParametersOn(java.lang.reflect.TypeVariable[] typeParameters) {
    for (java.lang.reflect.TypeVariable type : typeParameters) {
        registerTypeVariableIfNotPresent(type);
    }
}
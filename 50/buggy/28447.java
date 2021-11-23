protected void registerTypeParametersOn(java.lang.reflect.TypeVariable[] typeParameters) {
    for (java.lang.reflect.TypeVariable typeVariable : typeParameters) {
        registerTypeVariableIfNotPresent(typeVariable);
    }
}
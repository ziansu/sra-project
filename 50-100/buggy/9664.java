public <T> SigmaEC.util.Option<java.util.List<T>> getOptionalInstancesFromParameter(final java.lang.String parameterName, final java.lang.Class expectedSuperClass) {
    assert parameterName != null;
    assert expectedSuperClass != null;
    if (properties.containsKey(parameterName))
        return new SigmaEC.util.Option(((java.util.List<T>) (getInstancesFromParameter(parameterName, expectedSuperClass))));
    else
        return Option.NONE;
    
}
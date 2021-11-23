public void signalRelease(java.lang.String methodName, java.lang.String parameterSetup, java.lang.String parameter) {
    long k = getKeyOfMethod(methodName);
    java.util.List<java.lang.String> actualPars = releasedParameters.get(k).get(parameterSetup);
    if (!(actualPars.contains(parameter)))
        releasedParameters.get(k).get(parameterSetup).add(parameter);
    
}
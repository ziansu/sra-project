public void signalRelease(java.lang.String methodName, java.lang.String parameterSetup, char parameter) {
    long k = getKeyOfMethod(methodName);
    java.lang.String actualPars = releasedParameters.get(k).get(parameterSetup);
    if (!(actualPars.contains(("" + parameter))))
        releasedParameters.get(k).put(parameterSetup, (actualPars + parameter));
    
}
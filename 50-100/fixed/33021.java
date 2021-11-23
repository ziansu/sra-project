public void signalParametersPattern(java.lang.String currentMethodName, java.lang.String paramsPattern) {
    long k = getKeyOfMethod(currentMethodName);
    if (!(paramString.get(k).contains(paramsPattern))) {
        paramString.get(k).add(paramsPattern);
        releasedParameters.get(k).put(paramsPattern, new java.util.ArrayList<java.lang.String>());
        methodBehaviour.get(k).put(paramsPattern, new com.laneve.asp.ASMAnalysis.bTypes.Atom(com.laneve.asp.ASMAnalysis.bTypes.Atom.RETURN));
        analyzeMethods.put(k, true);
    }
}
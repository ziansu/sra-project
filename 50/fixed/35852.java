static java.util.HashMap<java.lang.String, java.lang.String> handleEncodedParams(java.lang.String paramsEncoded) {
    java.lang.String[] paramsTuples = webserver.Parser.breakEncodedParamsToTuples(paramsEncoded);
    return webserver.Parser.extractTupleParmas(paramsTuples);
}
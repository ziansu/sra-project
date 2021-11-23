private static java.lang.String getNodeRuntimeParameterValue(com.sixsq.slipstream.persistence.Run run, java.lang.String nodeName, java.lang.String key) throws com.sixsq.slipstream.exceptions.NotFoundException {
    java.lang.String keyPrefix = nodeName + (com.sixsq.slipstream.persistence.RuntimeParameter.NODE_PROPERTY_SEPARATOR);
    java.lang.String qualifiedKey = keyPrefix + (com.sixsq.slipstream.persistence.RuntimeParameter.NODE_NAME_KEY);
    return run.getRuntimeParameterValueIgnoreAbort(qualifiedKey);
}
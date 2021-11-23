private java.lang.String getArtifactsToExpire(com.atlassian.bamboo.collections.ActionParametersMap params) {
    final java.util.List<java.lang.String> artifactsNames = java.util.Arrays.asList(params.getStringArray(de.sagr.ci.bamboo.impl.ArtifactExpiryTaskConfigurator.ARTIFACT_EXPIRY_PARAM_NAME));
    final java.lang.StringBuilder builder = new java.lang.StringBuilder();
    final java.util.Iterator<java.lang.String> iter = artifactsNames.iterator();
    while (iter.hasNext()) {
        builder.append(iter.next());
        if (iter.hasNext()) {
            builder.append(";");
        }
    } 
    return builder.toString();
}
public static java.util.Set<java.lang.String> getArtifactNamesFromProject(final java.util.List<com.amazonaws.codepipeline.jenkinsplugin.OutputArtifact> outputArtifacts) {
    java.util.Set<java.lang.String> artifactNames = new java.util.HashSet<>();
    for (final com.amazonaws.codepipeline.jenkinsplugin.OutputArtifact outputArtifact : outputArtifacts) {
        if (((outputArtifact.getArtifactName()) != null) && (!(outputArtifact.getArtifactName().isEmpty()))) {
            artifactNames.add(outputArtifact.getArtifactName());
        }
    }
    return artifactNames;
}
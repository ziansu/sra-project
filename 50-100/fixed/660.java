@lombok.Synchronized
@lombok.SneakyThrows
public java.util.Optional<java.lang.String> getArtifact(@lombok.NonNull
java.lang.Integer buildNumber) {
    lombok.val paths = prepareSearch().itemsByProperty().property(org.icgc.dcc.dev.server.artifactory.ArtifactoryService.BUILD_NUMBER_PROPERTY_NAME, buildNumber).doSearch();
    return paths.stream().filter(this::isPrimaryArifact).findFirst().map(RepoPath::getItemPath).map(this::resolveAbsolutePath);
}
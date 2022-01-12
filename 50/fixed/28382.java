public boolean allDependenciesAvailableOrUpdated(com.verba.language.build.configuration.Build build, com.verba.language.build.targets.artifacts.interfaces.BuildArtifact artifact) {
    if (artifact == null) {
        return allTargetDependenciesAvailable(build);
    }else {
        return (isRequiredDependency(artifact)) && (allTargetDependenciesAvailable(build));
    }
}
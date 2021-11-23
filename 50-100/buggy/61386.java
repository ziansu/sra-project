public int buildSlangContent(java.lang.String directoryPath, java.lang.String testsPath, java.util.Set<java.lang.String> testSuits) {
    java.util.Map<java.lang.String, io.cloudslang.lang.compiler.modeller.model.Executable> slangModels = slangContentVerifier.createModelsAndValidate(directoryPath);
    java.util.Map<java.lang.String, io.cloudslang.lang.entities.CompilationArtifact> compiledSources = compileModels(slangModels);
    if (testsPath != null) {
        runTests(compiledSources, testsPath, testSuits);
    }
    return compiledSources.size();
}
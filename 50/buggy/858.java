public void initialArtifacts() {
    bootstrapApplication();
    loadRawArtifacts();
    evolution.updateWorkingMemory(currentGenerationOfProfiles);
    Src.Profile[] nextGenerationProfiles = evolution.generateNextSolutions(noOfProfiles);
    currentGenerationOfProfiles = nextGenerationProfiles;
    getResultArtifacts();
}
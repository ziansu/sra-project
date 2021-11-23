protected static void updateTracedFilesInRepository(java.util.List<java.lang.String[]> fileList, java.lang.String repositoryName, i5.las2peer.api.Service service) {
    i5.las2peer.services.codeGenerationService.generators.Generator.commitMultipleFilesRaw(repositoryName, "Code regeneration/Model synchronization", fileList.toArray(new java.lang.String[][]{  }), service);
}
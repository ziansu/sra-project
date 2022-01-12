public synchronized void submitBuildForReimport(org.scenarioo.business.builds.AvailableBuildsList availableBuilds, org.scenarioo.rest.base.BuildIdentifier buildIdentifier) {
    removeImportedBuildAndDerivedData(availableBuilds, buildIdentifier);
    submitBuildForImport(availableBuilds, buildIdentifier);
    submitBuildForComparison(buildIdentifier);
    saveBuildImportSummaries(buildImportSummaries);
}
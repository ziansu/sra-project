private synchronized void recordBuildImportFinished(org.scenarioo.model.docu.aggregates.branches.BuildImportSummary summary, org.scenarioo.model.docu.aggregates.branches.BuildImportStatus buildStatus, java.lang.String statusMessage) {
    summary = buildImportSummaries.get(summary.getIdentifier());
    summary.setStatus(buildStatus);
    summary.setStatusMessage(statusMessage);
    summary.setImportDate(new java.util.Date());
    buildsBeeingImported.remove(summary.getIdentifier());
    buildsInProcessingQueue.remove(summary.getIdentifier());
    org.scenarioo.business.builds.BuildImporter.saveBuildImportSummaries(buildImportSummaries);
}
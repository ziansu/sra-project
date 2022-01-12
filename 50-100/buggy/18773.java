@java.lang.Override
@org.jetbrains.annotations.NotNull
public com.hartwig.healthchecks.common.util.BaseReport runCheck() {
    com.hartwig.healthchecks.boggs.model.report.MappingReport mappingReport;
    try {
        mappingReport = dataExtractor.extractFromRunDirectory(runDirectory);
    } catch (java.io.IOException | com.hartwig.healthchecks.common.exception.EmptyFileException exception) {
        com.hartwig.healthchecks.boggs.healthcheck.mapping.MappingHealthChecker.LOGGER.error(java.lang.String.format(com.hartwig.healthchecks.boggs.healthcheck.mapping.MappingHealthChecker.ERROR_MSG, exception.getMessage()));
        return new com.hartwig.healthchecks.common.util.ErrorReport(com.hartwig.healthchecks.common.util.CheckType.MAPPING, exception.getClass().getName(), exception.getMessage());
    }
    final com.hartwig.healthchecks.boggs.model.report.MappingDataReport mappingDataReport = mappingReport.getMappingDataReport();
    logMappingReport(mappingReport, mappingDataReport);
    return mappingReport;
}
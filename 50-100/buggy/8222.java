@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    gobblin.data.management.conversion.hive.validation.ValidationJob.log.debug(java.lang.String.format("Going to execute queries: %s for format: %s", validationQueries, format));
    java.util.List<java.lang.Long> rowCounts = this.getValidationOutputFromHive(validationQueries);
    gobblin.data.management.conversion.hive.validation.ValidationJob.log.debug(java.lang.String.format("Going to execute queries: %s for format: %s", dataValidationQueries, format));
    java.util.List<java.lang.Long> rowDataValidatedCount = this.getValidationOutputFromHive(dataValidationQueries);
    validateAndPopulateReport(hiveDataset.getTable().getCompleteName(), updateTime, rowCounts, rowDataValidatedCount.get(0));
    return null;
}
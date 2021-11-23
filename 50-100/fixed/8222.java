@java.lang.Override
public java.lang.Void call() throws java.lang.Exception {
    gobblin.data.management.conversion.hive.validation.ValidationJob.log.debug(java.lang.String.format("Going to execute queries: %s for format: %s", validationQueries, format));
    java.util.List<java.lang.Long> rowCounts = this.getValidationOutputFromHive(validationQueries);
    validateAndPopulateReport(hiveDataset.getTable().getCompleteName(), updateTime, rowCounts);
    return null;
}
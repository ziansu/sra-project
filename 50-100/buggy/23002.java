public static java.lang.Long calculateQuotaUsedInPercent(com.orange.clara.cloud.servicedbdumper.model.DbDumperServiceInstance dbDumperServiceInstance) {
    com.orange.clara.cloud.servicedbdumper.model.DbDumperPlan dbDumperPlan = dbDumperServiceInstance.getDbDumperPlan();
    if ((dbDumperPlan.getSize()) == null) {
        return 0L;
    }
    java.lang.Long quota = dbDumperPlan.getSize();
    java.lang.Long percent = ((com.orange.clara.cloud.servicedbdumper.helper.CalculateQuota.calculateDumpFullSize(dbDumperServiceInstance)) * 100) / quota;
    if (percent > 100) {
        return 100L;
    }
    return percent;
}
public java.util.List<com.jaspersoft.android.sdk.service.data.schedule.JobUnit> searchJob(com.jaspersoft.android.sdk.service.report.schedule.JobSearchCriteria criteria) throws com.jaspersoft.android.sdk.service.exception.ServiceException {
    try {
        com.jaspersoft.android.sdk.service.data.server.ServerInfo info = mCacheManager.getInfo();
        java.util.Map<java.lang.String, java.lang.Object> searchParams = mSearchCriteriaMapper.transform(criteria);
        java.util.List<com.jaspersoft.android.sdk.network.entity.schedule.JobUnitEntity> jobUnitEntities = mScheduleRestApi.searchJob(searchParams);
        return mJobUnitMapper.transform(jobUnitEntities, info.getDatetimeFormatPattern());
    } catch (java.io.IOException e) {
        throw mExceptionMapper.transform(e);
    } catch (com.jaspersoft.android.sdk.network.HttpException e) {
        throw mExceptionMapper.transform(e);
    }
}
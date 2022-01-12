@com.google.inject.Provides
public gov.ca.cwds.rest.api.domain.cms.SystemCodeCache provideSystemCodeCache(gov.ca.cwds.data.cms.SystemCodeDao systemCodeDao, gov.ca.cwds.data.cms.SystemMetaDao systemMetaDao) {
    final long secondsToRefreshCache = ((15 * 24) * 60) * ((long) (60));
    gov.ca.cwds.rest.api.domain.cms.SystemCodeCache systemCodeCache = new gov.ca.cwds.rest.services.cms.CachingSystemCodeService(systemCodeDao, systemMetaDao, secondsToRefreshCache, true);
    systemCodeCache.register();
    return systemCodeCache;
}
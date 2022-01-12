public void clearCacheLocal(uk.gov.ea.datareturns.distributedtransaction.impl.Cache cache) {
    switch (cache) {
        case SITE_PERMIT_CACHES :
            siteDao.clearCaches();
            uniqueIdentifierDao.clearCaches();
            uniqueIdentifierAliasDao.clearCaches();
            search.initialize();
            uk.gov.ea.datareturns.distributedtransaction.impl.RemoteCacheDelegate.LOGGER.error(("Cleared cache group: " + cache));
        default :
            uk.gov.ea.datareturns.distributedtransaction.impl.RemoteCacheDelegate.LOGGER.error(("Not implemented: " + cache));
    }
}
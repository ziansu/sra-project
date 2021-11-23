private boolean checkUpdateDateIsValid(org.fao.fenix.d3s.cache.manager.impl.MeIdentification<org.fao.fenix.d3s.cache.manager.impl.DSDDataset> metadata, org.fao.fenix.d3s.cache.dto.StoreStatus status) {
    if ((metadata != null) && (status != null)) {
        java.util.Date cacheLastUpdate = status.getLastUpdate();
        for (java.util.Date lastUpdate : getDatasetLastUpdateDates(metadata))
            if ((cacheLastUpdate.getTime()) < (lastUpdate.getTime()))
                return false;
            
        
    }
    return true;
}
public int populateRelationSlaveData(java.util.List<java.lang.String> localOntologyIDs) {
    int numberOfRelationsAdded = 0;
    java.io.File relationEntryFile = null;
    try {
        obsMasterDao.removeAllDataFromTable(relationDao.getTableSQLName());
        relationEntryFile = obsMasterDao.writeMasterRelationEntries(localOntologyIDs);
        numberOfRelationsAdded = relationDao.populateSlaveRelationTableFromFile(relationEntryFile);
        org.ncbo.stanford.obr.service.obs.impl.ObsDataPopulationServiceImpl.logger.info(("Total Number of relations entries added in slave relation table : " + numberOfRelationsAdded));
    } finally {
        if ((relationEntryFile != null) && (relationEntryFile.exists())) {
            relationEntryFile.delete();
        }
    }
    return numberOfRelationsAdded;
}
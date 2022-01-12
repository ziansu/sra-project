void dumpStoredProperties() throws java.io.IOException {
    uk.ac.manchester.cs.owl.semspreadsheets.repository.bioportal.BioPortalCache.logger.error(("Storing cache in " + (uk.ac.manchester.cs.owl.semspreadsheets.repository.bioportal.BioPortalCache.getUserBioportalCache())));
    java.io.FileOutputStream stream = new java.io.FileOutputStream(uk.ac.manchester.cs.owl.semspreadsheets.repository.bioportal.BioPortalCache.getUserBioportalCache());
    uk.ac.manchester.cs.owl.semspreadsheets.repository.bioportal.BioPortalCache.bioportalCachedDetails.store(stream, null);
    stream.close();
    uk.ac.manchester.cs.owl.semspreadsheets.repository.bioportal.BioPortalCache.logger.error("Stored");
}
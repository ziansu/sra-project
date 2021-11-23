private org.lexevs.dao.indexer.utility.CodingSchemeMetaData reconciliateDbToIndex(org.lexevs.registry.model.RegistryEntry re, java.io.File f, java.util.List<org.lexevs.dao.index.lucenesupport.LuceneDirectoryFactory.NamedDirectory> namedDirectories, org.lexevs.dao.index.lucenesupport.LuceneDirectoryCreator directoryCreator) throws java.io.IOException, org.LexGrid.LexBIG.Exceptions.LBParameterException {
    org.lexevs.dao.indexer.utility.CodingSchemeMetaData csMetaData = null;
    csMetaData = new org.lexevs.dao.indexer.utility.CodingSchemeMetaData(re.getResourceUri(), re.getResourceVersion(), locator.getSystemResourceService().getInternalCodingSchemeNameForUserCodingSchemeName(re.getResourceUri(), re.getResourceVersion()), makeNewDirectoryIfNone(re));
    return csMetaData;
}
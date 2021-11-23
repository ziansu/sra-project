private org.lexevs.dao.index.lucenesupport.LuceneDirectoryFactory.NamedDirectory makeNewDirectoryIfNone(org.lexevs.registry.model.RegistryEntry re) throws java.io.IOException {
    org.lexevs.dao.index.lucenesupport.LuceneMultiDirectoryFactory multiDirectoryFactory = new org.lexevs.dao.index.lucenesupport.LuceneMultiDirectoryFactory();
    org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference reference = new org.LexGrid.LexBIG.DataModel.Core.AbsoluteCodingSchemeVersionReference();
    reference.setCodingSchemeURN(re.getResourceUri());
    reference.setCodingSchemeVersion(re.getResourceVersion());
    return multiDirectoryFactory.getNamedDirectory(org.lexevs.dao.indexer.utility.Utility.getIndexName(reference));
}
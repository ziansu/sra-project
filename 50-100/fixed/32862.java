public static java.util.List<org.lexevs.dao.index.lucenesupport.LuceneDirectoryFactory.NamedDirectory> getNamedDirectories(org.lexevs.dao.indexer.utility.ConcurrentMetaData metaDirectories) {
    java.util.List<org.lexevs.dao.index.lucenesupport.LuceneDirectoryFactory.NamedDirectory> directories = new java.util.ArrayList<org.lexevs.dao.index.lucenesupport.LuceneDirectoryFactory.NamedDirectory>();
    for (org.lexevs.dao.indexer.utility.CodingSchemeMetaData csmd : metaDirectories.getCodingSchemeList()) {
        directories.add(csmd.getDirectory());
    }
    return directories;
}
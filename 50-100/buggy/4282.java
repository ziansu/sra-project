public static boolean perform(org.teiid.designer.metamodels.relational.Table table, org.teiid.designer.transformation.reverseeng.api.Options options) throws java.lang.Exception {
    org.teiid.designer.transformation.reverseeng.ReverseEngineerFactory.errors = null;
    org.teiid.designer.transformation.reverseeng.api.MetadataProcessor metadata = new org.teiid.designer.transformation.reverseeng.RelationalMetadataProcessor();
    metadata.loadMetadata(table, options);
    org.teiid.designer.transformation.reverseeng.PojoProcessing tp = new org.teiid.designer.transformation.reverseeng.PojoProcessing(options);
    boolean success = tp.processTables(metadata);
    if (!success)
        org.teiid.designer.transformation.reverseeng.ReverseEngineerFactory.checkErrors(tp);
    
    return success;
}
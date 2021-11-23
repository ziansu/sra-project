private java.lang.Long createCXEdgeBySID(java.lang.String SID) throws org.ndexbio.model.exceptions.DuplicateObjectException {
    java.lang.Long edgeId = ndexdb.getNextId();
    new com.orientechnologies.orient.core.record.impl.ODocument(org.ndexbio.common.NdexClasses.Edge).fields(NdexClasses.Element_ID, edgeId, NdexClasses.Element_SID, SID).save();
    java.lang.Long oldId = edgeSIDMap.put(SID, edgeId);
    if (oldId != null)
        throw new org.ndexbio.model.exceptions.DuplicateObjectException(org.cxio.aspects.datamodels.EdgesElement.NAME, SID);
    
    tick();
    return edgeId;
}
private com.documentum.fc.common.IDfValue getFolderPathAsDfValue(com.documentum.fc.client.IDfSession dfSession, com.documentum.fc.client.IDfPersistentObject dmsObj, int index) throws com.documentum.fc.common.DfException {
    final com.documentum.fc.common.IDfId dfId = dmsObj.getId(PersistentProperty.DMS_ATTR_FOLDER_ID);
    final com.documentum.fc.client.IDfFolder parentFolder = ((com.documentum.fc.client.IDfFolder) (dfSession.getObject(dfId)));
    final com.documentum.fc.common.IDfValue dfValue = new com.documentum.fc.common.DfValue(parentFolder.getFolderPath(index));
    return dfValue;
}
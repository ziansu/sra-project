private void setBusinessMetadata(co.cask.cdap.data2.metadata.dataset.BusinessMetadataRecord metadataRecord, co.cask.cdap.data2.metadata.dataset.BusinessMetadataDataset.MetadataType metadataType) {
    co.cask.cdap.proto.Id.NamespacedId targetId = metadataRecord.getTargetId();
    java.lang.String key = metadataRecord.getKey();
    co.cask.cdap.data2.dataset2.lib.table.MDSKey mdsKey = getMDSKey(targetId, metadataType, key);
    write(mdsKey, metadataRecord);
}
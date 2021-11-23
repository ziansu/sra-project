private void handleForeignKey(org.talend.mdm.commmon.metadata.MetadataRepository repository, org.talend.mdm.commmon.metadata.ComplexTypeMetadata type, org.talend.mdm.commmon.metadata.annotation.XmlSchemaAnnotationProcessorState state, org.w3c.dom.Element appInfo) {
    state.markAsReference();
    java.lang.String path = appInfo.getTextContent();
    org.talend.mdm.commmon.metadata.FieldMetadata fieldMetadata = org.talend.mdm.commmon.metadata.annotation.ForeignKeyProcessor.getFieldMetadata(repository, type, appInfo, path);
    state.setReferencedField(fieldMetadata);
    state.setReferencedType(new org.talend.mdm.commmon.metadata.SoftTypeRef(repository, repository.getUserNamespace(), org.talend.mdm.commmon.metadata.annotation.ForeignKeyProcessor.getTypeName(type, path), true));
}
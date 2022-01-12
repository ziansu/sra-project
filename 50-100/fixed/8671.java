private void handleForeignKeyInfo(org.talend.mdm.commmon.metadata.MetadataRepository repository, org.talend.mdm.commmon.metadata.annotation.XmlSchemaAnnotationProcessorState state, org.w3c.dom.Element appInfo) {
    java.lang.String path = appInfo.getTextContent();
    org.talend.mdm.commmon.metadata.FieldMetadata fieldMetadata = org.talend.mdm.commmon.metadata.annotation.ForeignKeyProcessor.getFieldMetadata(repository, ((org.talend.mdm.commmon.metadata.ComplexTypeMetadata) (state.getReferencedType())), appInfo, path, true);
    state.setForeignKeyInfo(fieldMetadata);
}
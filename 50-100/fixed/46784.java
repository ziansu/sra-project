public void resetMetadata() throws org.lareferencia.backend.metadata.OAIRecordMetadata.OAIRecordMetadataParseException {
    if (((this.originalXML) != null) && ((this.originalXML.length()) > 0)) {
        this.metadata = new org.lareferencia.backend.metadata.OAIRecordMetadata(this.identifier, this.originalXML);
    }
}
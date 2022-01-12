@javax.persistence.PostLoad
private void loadMetadata() throws org.lareferencia.backend.metadata.OAIRecordMetadata.OAIRecordMetadataParseException {
    if ((((this.metadata) == null) && ((this.publishedXML) != null)) && ((this.publishedXML.length()) > 0)) {
        this.metadata = new org.lareferencia.backend.metadata.OAIRecordMetadata(this.identifier, this.publishedXML);
    }
}
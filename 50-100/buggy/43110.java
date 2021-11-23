@javax.persistence.PostLoad
private void loadMetadata() {
    try {
        if ((((this.metadata) == null) && ((this.publishedXML) != null)) && ((this.publishedXML.length()) > 0)) {
            this.metadata = new org.lareferencia.backend.metadata.OAIRecordMetadata(this.identifier, this.publishedXML);
        }
    } catch (org.lareferencia.backend.metadata.OAIRecordMetadata.OAIRecordMetadataParseException e) {
        java.lang.System.err.println("Error de parseo de metadata.");
    }
}
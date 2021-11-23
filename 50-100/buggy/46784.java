public void resetMetadata() {
    try {
        if (((this.originalXML) != null) && ((this.originalXML.length()) > 0)) {
            this.metadata = new org.lareferencia.backend.metadata.OAIRecordMetadata(this.identifier, this.originalXML);
        }
    } catch (org.lareferencia.backend.metadata.OAIRecordMetadata.OAIRecordMetadataParseException e) {
        java.lang.System.err.println("Error de parseo de metadata.");
    }
}
@javax.persistence.PrePersist
private void updatePublishedXML() {
    if ((metadata) != null)
        publishedXML = metadata.toString();
    
}
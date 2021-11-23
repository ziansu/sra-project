@javax.persistence.PreUpdate
@javax.persistence.PrePersist
public void updatePublishedXML() {
    if ((this.metadata) != null)
        publishedXML = metadata.toString();
    
}
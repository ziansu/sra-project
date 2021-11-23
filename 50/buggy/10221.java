@org.mongodb.morphia.annotations.PrePersist
public void prePersist() {
    this.lastUpdated = new java.util.Date();
}
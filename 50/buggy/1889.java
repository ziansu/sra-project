public void setId(int id) {
    this.id = id;
    setLastUpdatedAt(java.time.LocalDateTime.now());
}
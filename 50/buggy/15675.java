public void setAdmin(java.lang.String admin) {
    java.lang.String oldAdmin = this.hallAdmin;
    this.hallAdmin = admin;
    firePropertyChange("admin", oldAdmin, this.hallAdmin);
}
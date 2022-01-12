public void setLocation(java.lang.String location) {
    if (location == null)
        this.location = null;
    else {
        this.location = location.trim();
        this.location = this.location.replace("\\", "\\\\");
        this.location = this.location.replace("\"", "\\\"");
        this.location = this.location.replace("/", "\\/");
    }
}
public void updateVersion(final java.lang.Long version) {
    if ((this.version) == null) {
        this.version = version;
    }else
        if (version >= (this.version)) {
            this.version = version;
        }else {
            throw new java.lang.IllegalStateException(((("Cannot update the flow version to a lower value. Current version: " + (this.version)) + ", new value: ") + version));
        }
    
}
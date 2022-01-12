public void flush(java.lang.String address) {
    if (!(isMirror())) {
        this.address = address;
    }
}
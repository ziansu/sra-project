public void reset() {
    if ((currentHash) != null) {
        this.prevHash = currentHash;
    }
    this.currentHash = null;
}
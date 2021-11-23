public boolean hasChanges() {
    if ((this.delta) != null) {
        if ((this.delta.length) > 0) {
            return true;
        }
    }
    return false;
}
public boolean isIndeterminate() {
    synchronized(this) {
        return this.indeterminate;
    }
}
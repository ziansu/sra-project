public int getNchannels() {
    return hasDimensions() ? 0 : this.dimensions[4];
}
public final void decrementRotation() {
    this.orientation = ((this.orientation) - 1) % (this.layout.size());
}
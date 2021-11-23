public void tick() {
    this.markDirty();
    tickNetwork();
    tickNode();
}
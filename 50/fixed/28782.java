public boolean reachedEdge() {
    return ((this.position.getRow()) == 0) || ((this.position.getRow()) == (this.position.getGrid().getRows()));
}
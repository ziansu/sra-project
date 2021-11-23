public boolean remove() {
    if ((this.index) < 0) {
        return false;
    }
    removeAt(this.index);
    return true;
}
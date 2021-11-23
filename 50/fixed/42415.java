public boolean lock() {
    if (!(isOpen())) {
        return false;
    }
    this.open = false;
    return true;
}